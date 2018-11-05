package com.exam.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.sp.service.ExamService;
import com.exam.sp.vo.Exam;

@Controller

public class ExamController {

    @Autowired

    private ExamService es;

    @GetMapping(value="/exams")

    public @ResponseBody List<Exam> getExamList() {

        return es.getExamList();

    }

    @GetMapping(value="/exams/{num}")

    public @ResponseBody Exam getExam(@PathVariable Integer num) {

        return es.getExam(num);

    }

    @PostMapping(value="/exams/{num}")

    public @ResponseBody int insertExam(@RequestBody Exam e) {

        return es.insertExam(e);

    }    

    @PutMapping(value="/exams/{num}")

    public @ResponseBody int updateExam(@RequestBody Exam e, @PathVariable Integer num) {

        e.setNum(num); 

        return es.updateExam(e);

    }    

    @DeleteMapping(value="/exams/{num}")

    public @ResponseBody int deleteExam(@PathVariable Integer num) {

        return es.deleteExam(num);

    }

}