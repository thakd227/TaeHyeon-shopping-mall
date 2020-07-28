package com.majustory.k1.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.majustory.k1.shop.MemberVo;
import com.majustory.k1.shop.MoneyVo;
import com.majustory.k1.shop.dao.ShoppingDao;
import com.majustory.k1.shop.dao.ShoppingSelectDao;
import com.majustory.k1.shop.mybatis.MybatisShoppingDaoImpl;
import com.majustory.k1.shop.mybatis.MybatisShoppingSelectDaoImpl;


@Service
public class ShoppingService {
	
	@Autowired
	MybatisShoppingDaoImpl daoA ;
	
	@Autowired
	MybatisShoppingSelectDaoImpl  daoB ;
	 

	public void insert(MemberVo vo) {
		daoA.insert(vo);
	}
	
	public void delete(MemberVo vo) {
		daoA.delete(vo);
	}
	public void editok(MemberVo v) {
		// TODO Auto-generated method stub
		 daoA.editok(v);
	}
	
	
	
	
	public  List<MemberVo> selectAll(MemberVo v)  {
		  return daoB.selectAll(v);
	}

	public MemberVo edit(MemberVo v) {
		// TODO Auto-generated method stub
		return daoB.edit(v);
	}
	
	public List<MoneyVo> moneyselectAll(MoneyVo v) {
		return daoB.moneyselectAll(v);
	}

	public Object salesSelectAll(MoneyVo vo) {
		// TODO Auto-generated method stub
		return daoB.salesSelectAll(vo);
	}
	
	public void update2(MoneyVo vo){
		
		daoA.update2(vo);
	}

}
