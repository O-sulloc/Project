package com.pj.market.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaService {
	
	@Autowired
	private QnaDAO qnaDAO;
	
	public List<QnaDTO> list(QnaDTO qnaDTO) throws Exception{
		return qnaDAO.list(qnaDTO);
	}

}
