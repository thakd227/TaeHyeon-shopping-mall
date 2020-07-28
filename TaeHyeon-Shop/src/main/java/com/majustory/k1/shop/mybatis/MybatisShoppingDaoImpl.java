package com.majustory.k1.shop.mybatis;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.majustory.k1.shop.MemberVo;
import com.majustory.k1.shop.MoneyVo;
import com.majustory.k1.shop.dao.ShoppingDao;

@Repository
public class MybatisShoppingDaoImpl implements ShoppingDao {

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public void insert(MemberVo vo) {
		mybatis.insert("MemberDAO.insertMember", vo);
	}

	@Override
	public void delete(MemberVo vo) {
		mybatis.delete("MemberDAO.deleteMember", vo);
	}

	@Override
	public void editok(MemberVo v) {
		mybatis.update("MemberDAO.editokMember", v);
	}

	@Override
	public void update2(MoneyVo v) {
		mybatis.update("MemberDAO.update2", v);

	}

}
