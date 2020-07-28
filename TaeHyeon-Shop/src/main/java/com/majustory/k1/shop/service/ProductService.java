package com.majustory.k1.shop.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.majustory.k1.shop.ProductVo;
import com.majustory.k1.shop.dao.ProductDao;
import com.majustory.k1.shop.mybatis.MybatisProductDaoImpl;

@Service
public class ProductService {
	@Autowired
	MybatisProductDaoImpl dao ;
	
	public  void   insert(ProductVo v ) {
		dao.insert(v);
	}

	public List<ProductVo> selectAll(ProductVo v, HttpSession session) {
		// TODO Auto-generated method stub
		return dao.selectAll(v, session);
	}

	public ProductVo selectCount(ProductVo vo) {
		// TODO Auto-generated method stub
		return dao.selectCount(vo);
	}
	
	public ProductVo edit(ProductVo v) {
		// TODO Auto-generated method stub
		return dao.edit(v);
	}

	public ProductVo pcodeMaxl(ProductVo v) {
		// TODO Auto-generated method stub
		return dao.pcodeMaxl(v);
	}

	public ProductVo shopping(ProductVo v) {
		// TODO Auto-generated method stub
		return dao.shopping(v);
	}

	public void shoppingok(ProductVo v) {
		// TODO Auto-generated method stub
		 dao.shoppingok(v);
	}

	public void productDelete(ProductVo vo) {
		// TODO Auto-generated method stub
		 dao.productDelete(vo);
	}

	public List<ProductVo> selectTop12(ProductVo vo) {
		// TODO Auto-generated method stub
		return dao.selectTop12(vo);
	}
		
	
}
