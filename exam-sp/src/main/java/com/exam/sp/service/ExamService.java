package com.exam.sp.service;

import java.util.List;

import com.exam.sp.vo.Exam;

public interface ExamService {

	public List<Exam> getExamList();
	public Exam getExam(Integer num);
	public int insertExam(Exam e);
	public int updateExam(Exam e);
	public int deleteExam(Integer num);
}
