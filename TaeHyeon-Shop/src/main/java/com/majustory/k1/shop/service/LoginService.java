package com.majustory.k1.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.majustory.k1.shop.MemberVo;
import com.majustory.k1.shop.dao.ShoppingSelectDao;
import com.majustory.k1.shop.mybatis.MybatisShoppingSelectDaoImpl;

@Service
public class LoginService {
	@Autowired
	MybatisShoppingSelectDaoImpl  daoB ;
	
	public MemberVo login(MemberVo v) {

		return daoB.login(v);
	}
}
