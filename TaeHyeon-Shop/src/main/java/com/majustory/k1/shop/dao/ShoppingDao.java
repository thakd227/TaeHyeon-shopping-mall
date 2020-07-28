package com.majustory.k1.shop.dao;

import com.majustory.k1.shop.MemberVo;
import com.majustory.k1.shop.MoneyVo;

public interface ShoppingDao {
    void  insert(MemberVo  vo);

	void delete(MemberVo vo);

	void editok(MemberVo v);
	public void update2(MoneyVo vo); 
	
}
