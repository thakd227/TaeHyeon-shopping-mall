package com.majustory.k1.shop.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.majustory.k1.shop.ProductVo;

public interface ProductDao {
	public  void   insert(ProductVo v ) ;
	public List<ProductVo> selectAll(ProductVo v, HttpSession session);
	public ProductVo selectCount(ProductVo vo);
	
	public ProductVo edit(ProductVo v);
	public ProductVo pcodeMaxl(ProductVo v);
	public ProductVo shopping(ProductVo v);
	public void shoppingok(ProductVo v);
	public void productDelete(ProductVo vo);
	public List<ProductVo> selectTop12(ProductVo vo);
	
	
	
}
