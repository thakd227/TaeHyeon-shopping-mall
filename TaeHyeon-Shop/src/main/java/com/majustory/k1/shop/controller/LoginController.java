package com.majustory.k1.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.majustory.k1.shop.MemberVo;
import com.majustory.k1.shop.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService service;

	@RequestMapping(value = "/Login.do", method = RequestMethod.GET)
	public String login(MemberVo vo, HttpServletRequest request, HttpSession session) throws Exception {
		System.out.println("vo is  :" + vo);
		MemberVo login = service.login(vo);
		if (vo.getCustno() == 99999 && vo.getPassword().equals("99999")) {
			session.setAttribute("admin", "admin");
		}

		if (login == null) {
			session.setAttribute("user", null);
			System.out.println("아이디 및 비밀번호를 확인해주세요 ");
			return "/login/login.jsp";
		} else {
			session.setAttribute("user", login);
			return "/product_list.do";
		}

	}

	@RequestMapping(value = "/logout.do",method = RequestMethod.GET)
	public String logout(MemberVo vo, HttpServletRequest request, HttpSession session) throws Exception {
		session.invalidate();
		return "/index.jsp";

	}

}
