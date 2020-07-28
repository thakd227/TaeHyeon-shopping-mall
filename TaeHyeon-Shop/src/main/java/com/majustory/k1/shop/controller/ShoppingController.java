package com.majustory.k1.shop.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.majustory.k1.shop.MemberVo;
import com.majustory.k1.shop.MoneyVo;
import com.majustory.k1.shop.service.ShoppingService;

@Controller
public class ShoppingController {
	@Autowired
	ShoppingService service;

	@RequestMapping(value = "/insertMember.do", method = RequestMethod.POST)
	public String insertBoard(MemberVo vo, HttpServletRequest request) throws Exception, IOException {

		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("MM-dd_HHmmss");
		String time1 = dayTime.format(time);

		String RealPath = request.getSession().getServletContext().getRealPath("/files/");
		System.out.println("RealPath --> :" + RealPath);
		MultipartFile uploadfile = vo.getUploadfile();

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
			vo.setPfile("제목없음.jpg");
		}
		service.insert(vo);
		return "/member_list.do";
	}

	@RequestMapping(value = "/deleteMember.do", method = RequestMethod.GET)
	public String delete(MemberVo vo, HttpServletRequest request) throws Exception {
		MemberVo f = service.edit(vo);
		String RealPath = request.getSession().getServletContext().getRealPath("/files/");
		File file = new File(RealPath + f.getPfile());
		file.delete();

		service.delete(vo);
		return "/member_list.do";
	}

	@RequestMapping(value = "/editokMember.do", method = RequestMethod.GET)
	public String editok(MemberVo vo, HttpServletRequest request) throws Exception {
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("MM-dd_HHmmss");
		String time1 = dayTime.format(time);

		String RealPath = request.getSession().getServletContext().getRealPath("/files/");
		MultipartFile uploadfile = vo.getUploadfile();

		MemberVo f = service.edit(vo);

		if (!uploadfile.isEmpty()) {

			File file = new File(RealPath + f.getPfile());
			file.delete();

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
			vo.setPfile(f.getPfile());
		}

		service.editok(vo);
		return "/member_list.do";
	}

	@RequestMapping(value = "/editMember.do", method = RequestMethod.GET)
	public String edit(MemberVo vo, Model mav) throws Exception {
		mav.addAttribute("m", service.edit(vo));
		return "/shopping/edit.jsp";
	}

	@RequestMapping(value = "/moneyselectAll.do", method = RequestMethod.GET)
	public String moneyselectAll(MoneyVo vo, Model mav) throws Exception {
		mav.addAttribute("moneyList", service.moneyselectAll(vo));
		return "/shopping/money_list.jsp";
	}

	@RequestMapping(value = "/sales_list.do", method = RequestMethod.GET)
	public String salesSelectAll(MoneyVo vo, Model mav) throws Exception {
		mav.addAttribute("salesList", service.salesSelectAll(vo));
		return "/shopping/sales_list.jsp";
	}

	@RequestMapping(value = "/member_list.do", method = RequestMethod.GET)
	public String selectAll(MemberVo vo, Model mav) throws Exception {

		mav.addAttribute("boardList", service.selectAll(vo));
		return "/shopping/member_list.jsp";
	}

}
