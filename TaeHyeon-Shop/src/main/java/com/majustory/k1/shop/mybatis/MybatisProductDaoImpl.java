package com.majustory.k1.shop.mybatis;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.majustory.k1.shop.ProductVo;
import com.majustory.k1.shop.dao.ProductDao;

@Repository
public class MybatisProductDaoImpl implements ProductDao {

	static int page_size = 10;

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public void insert(ProductVo v) {

		mybatis.insert("BoardDAO.insertBoard", v);

	}

	@Override
	public List<ProductVo> selectAll(ProductVo k, HttpSession session) {
		int now_record;
		if (k.getNow_record() == 0) {
			now_record = 1;
		} else {
			now_record = k.getNow_record();
		}
		int startno = now_record;
		int endno = now_record + page_size - 1;

		k.setStartno(startno);
		k.setEndno(endno);

		return mybatis.selectList("BoardDAO.selectBoard", k);
	}

	@Override
	public ProductVo selectCount(ProductVo v) {

		int tc = mybatis.selectOne("BoardDAO.selectCount");

		int page_list_size = 10; // 3. page_list_size
		int now_record = v.getNow_record(); // 4. now_record
		int pagetotal = (int) (Math.ceil((double) tc / page_size));

		int now_page = (int) (Math.ceil((now_record + 1) / page_size) + 1);
		int start_page = (now_page - 1) / page_list_size * page_list_size + 1;
		int end_page = start_page + page_list_size - 1;

		v.setPage_size(page_size); // 1. page_size
		v.setPage_list_size(page_list_size); // 2. page_list_size = 10
		v.setTc(tc); // 3. 전체 레코드수
		v.setNow_record(now_record); // 4. now_record
		v.setPagetotal(pagetotal); // 5. 전체페이지수(pagetotal)
		v.setNow_page(now_page); // 6. 현재페이지

		v.setStart_page(start_page); // 7. 페이지 list의 start_page [1] , [11] , [21]
		v.setEnd_page(end_page); // 8. 페이지 list의 end_page [10], [20], [30]

		return v;
	}

	@Override
	public ProductVo edit(ProductVo v) {
		v.setPcode(v.getPcode());
		return mybatis.selectOne("BoardDAO.edit", v);
	}

	@Override
	public ProductVo pcodeMaxl(ProductVo v) {

		return mybatis.selectOne("BoardDAO.pcodeMaxl");
	}

	@Override
	public ProductVo shopping(ProductVo v) {
		v.setPcode(v.getPcode());
		return mybatis.selectOne("BoardDAO.shopping", v);
	}

	@Override
	public void shoppingok(ProductVo v) {

		mybatis.selectOne("BoardDAO.shoppingok2", v);

	}

	@Override
	public void productDelete(ProductVo vo) {

		vo.setPcode(vo.getPcode());
		mybatis.delete("BoardDAO.productDelete", vo);

	}

	@Override
	public List<ProductVo> selectTop12(ProductVo vo) {

		return mybatis.selectList("BoardDAO.selectTop12");

	}

}
