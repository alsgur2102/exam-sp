package com.exam.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.sp.dao.ExamDAO;
import com.exam.sp.vo.Exam;

@Repository
public class ExamDAOImpl implements ExamDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Exam> getExamList() {
		return ss.selectList("com.exam.sp.Exam.selectExamList");
	}

	@Override
	public Exam getExam(Integer num) {
		return ss.selectOne("com.exam.sp.Exam.selectExam",num);
	}

	@Override
	public int insertExam(Exam e) {
		return ss.insert("com.exam.sp.Exam.insertExam",e); 
	}

	@Override
	public int updateExam(Exam e) {
		return ss.update("com.exam.sp.Exam.updateExam",e); 
	}

	@Override
	public int deleteExam(Integer num) {
		return ss.delete("com.exam.sp.Exam.deleteExam",num); 
	}

}
