package com.pj.market.notice;

import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pj.market.util.Pager;

@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.pj.market.notice.NoticeDAO.";

	// list
	public List<NoticeDTO> list(Pager pager) throws Exception {
		return sqlSession.selectList(NAMESPACE + "list", pager);
	}

	// detail
	public NoticeDTO detail(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "detail", noticeDTO);
	}

	// add
	public int add(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + "add", noticeDTO);
	}

	// delete
	public int delete(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.delete(NAMESPACE + "delete", noticeDTO);
	}

	// update
	public int update(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"update", noticeDTO);
	}
	
	//total
	public Long total(Pager pager) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"total", pager);
	}
}
