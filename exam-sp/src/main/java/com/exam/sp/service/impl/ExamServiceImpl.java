package com.exam.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.sp.dao.ExamDAO;
import com.exam.sp.service.ExamService;
import com.exam.sp.vo.Exam;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamDAO edao;
	
	@Override
	public List<Exam> getExamList() {
		return edao.getExamList();
	}

	@Override
	public Exam getExam(Integer num) {
		return edao.getExam(num);
	}

	@Override
	public int insertExam(Exam e) {
		return edao.insertExam(e);
	}

	@Override
	public int updateExam(Exam e) {
		return edao.updateExam(e);
	}

	@Override
	public int deleteExam(Integer num) {
		return edao.deleteExam(num);
	}

}
