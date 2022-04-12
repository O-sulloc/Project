package com.pj.market.qna.QnaReply;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QnaReplyDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private String NAMESPACE = "com.pj.market.qna.QnaReply.QnaReplyDAO.";
	
	public int add(QnaReplyDTO qnaReplyDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"add", qnaReplyDTO);
	}
	
	public List<QnaReplyDTO> list(QnaReplyDTO qnaReplyDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"list", qnaReplyDTO);
	}
	
	public int delete(QnaReplyDTO qnaReplyDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"delete", qnaReplyDTO);
	}
	
	public int update(QnaReplyDTO qnaReplyDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"update", qnaReplyDTO);
	}

}
