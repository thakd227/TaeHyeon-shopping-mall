package com.majustory.k1.shop.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import com.majustory.k1.shop.MemberVo;
import com.majustory.k1.shop.MoneyVo;
import com.majustory.k1.shop.dao.ShoppingSelectDao;


@Repository
public class MybatisShoppingSelectDaoImpl   implements ShoppingSelectDao {
	   @Autowired
		private  SqlSessionTemplate  mybatis;

	@Override
	public List<MemberVo> selectAll(MemberVo v) {
		if (v.getCh2() == null || v.getCh2() ==""  ) {
			return mybatis.selectList("MemberDAO.selectall1", v);
		} else {
			return mybatis.selectList("MemberDAO.selectall2", v);
		}
	}

	@Override
	public MemberVo edit(MemberVo v) {
		   v.setCustno(v.getCustno());		
			return mybatis.selectOne("MemberDAO.editMember",v);	
	}

	@Override
	public List<MoneyVo> moneyselectAll(MoneyVo v) {
	 	return mybatis.selectList("MemberDAO.moneyselectAll");
	}

	@Override
	public MemberVo login(MemberVo v) {
		
	return mybatis.selectOne("MemberDAO.login",v);

	}

	@Override
	public List<MoneyVo> salesSelectAll(MoneyVo vo) {
		
		if ( vo.getYymm1() != null && vo.getYymm1() !="") {			
			String aa = vo.getYymm1().substring(2, 4)+"/"+vo.getYymm1().substring(5, 7) + "/" + vo.getYymm1().substring(8, 10) ;
			String bb = vo.getYymm2().substring(2, 4)+"/"+vo.getYymm2().substring(5, 7) + "/" + vo.getYymm2().substring(8, 10) ;
			vo.setAa(aa);
			vo.setBb(bb);
			return  mybatis.selectList("MemberDAO.salesSelectAll1", vo);
		} else if ( vo.getYymm() != null && vo.getYymm() !="") {
		 	String kc = vo.getYymm().substring(2, 4) + "/" + vo.getYymm().substring(5, 7) ;
			vo.setKc(kc);
			return  mybatis.selectList("MemberDAO.salesSelectAll2", vo);
		} else { 			
			return  mybatis.selectList("MemberDAO.salesSelectAll3", vo);
		}		

	}

}
