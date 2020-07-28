package com.majustory.k1.shop.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.majustory.k1.shop.MoneyVo;
import com.majustory.k1.shop.ProductVo;
import com.majustory.k1.shop.service.ProductService;
import com.majustory.k1.shop.service.ShoppingService;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	@Autowired
	ShoppingService service2;

	@RequestMapping(value = "/product_list.do",method=RequestMethod.GET)
	public String selectAll(ProductVo vo, Model mav, HttpSession session) throws Exception {

		mav.addAttribute("productList", service.selectAll(vo, session));
		mav.addAttribute("c", service.selectCount(vo));

		return "/product/product_list.jsp";
	}

	@RequestMapping(value = "/product_list12.do",method=RequestMethod.GET)
	public String selectTop12(ProductVo vo, Model mav) throws Exception {

		mav.addAttribute("productList", service.selectTop12(vo));

		return "/product/product_list2.jsp";
	}

	@RequestMapping(value = "/productedit.do",method=RequestMethod.GET)
	public String edit(ProductVo vo, Model mav) throws Exception {

		mav.addAttribute("m", service.edit(vo));
		return "/product/edit.jsp";
	}

	@RequestMapping(value = "/shopping.do",method = RequestMethod.GET)
	public String shopping(ProductVo vo, Model mav) throws Exception {
		mav.addAttribute("m", service.shopping(vo));
		return "/product/shopping.jsp";

	}

	@RequestMapping(value = "/shoppingok.do",method = RequestMethod.POST)
	public String shoppingok(ProductVo vo, Model mav, HttpSession session) throws Exception {
		//상품 구매시 해당 상품의 수량 감소 및 매출 증가
		String c = vo.getPcode();
		int z = vo.getPcost();
		int x = vo.getQuantity();
		int y = z * x;
		service.shoppingok(vo);
		MoneyVo moneyVo = new MoneyVo();
		moneyVo.setPcode(c);
		moneyVo.setPrice(y);
		service2.update2(moneyVo);

		return "/product_list.do";

	}

	@RequestMapping(value = "/productDelete.do",method=RequestMethod.GET)
	public String productDelete(ProductVo vo, Model mav) throws Exception {
		service.productDelete(vo);
		return "/product_list.do";
	}

	@RequestMapping(value = "/product_form.do",method=RequestMethod.GET)
	public String product_form(ProductVo vo, Model mav) throws Exception {
		mav.addAttribute("m", service.pcodeMaxl(vo));
		return "/product/product_form.jsp";
	}

	@RequestMapping(value = "/productinsert.do",method=RequestMethod.POST)
	public String insertBoard(ProductVo vo, HttpServletRequest request) throws Exception, IOException {

		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("MM-dd_HHmmss");
		String time1 = dayTime.format(time);

		String RealPath = request.getSession().getServletContext().getRealPath("/files2/");
		System.out.println("상품이미지경로 : " + RealPath);
		MultipartFile uploadfile = vo.getPfilename();

		if (!uploadfile.isEmpty()) {
			String fileName = uploadfile.getOriginalFilename();
			if (new File(RealPath + fileName).exists()) {
				String OriginfileName = uploadfile.getOriginalFilename();
				String Onlyfilename = OriginfileName.substring(0, OriginfileName.indexOf(".")); // 파일명
				String extension = OriginfileName.substring(OriginfileName.indexOf(".")); // 확장자
				fileName = Onlyfilename + "_" + time1 + extension; // 파일명_날짜.확장자 의 형태로 변환
				uploadfile.transferTo(new File(RealPath + fileName));
				vo.setPfile(fileName);
			} else {
				uploadfile.transferTo(new File(RealPath + fileName));
				vo.setPfile(fileName);
			}
		} else {
			vo.setPfile("space.jpg");
		}
		service.insert(vo);
		return "/product_list.do";
	}

}
