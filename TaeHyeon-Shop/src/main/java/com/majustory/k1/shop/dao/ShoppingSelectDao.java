package com.majustory.k1.shop.dao;

import java.util.List;

import com.majustory.k1.shop.MemberVo;
import com.majustory.k1.shop.MoneyVo;

public interface ShoppingSelectDao {
    List<MemberVo> selectAll(MemberVo v) ;

	MemberVo edit(MemberVo v);

	List<MoneyVo> moneyselectAll(MoneyVo v);

	MemberVo login(MemberVo v);

	List<MoneyVo> salesSelectAll(MoneyVo vo);
   
}
