package com.ddd.application.impl;

import com.ddd.application.ViewingReportCardService;
import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.Student;
import com.ddd.domain.model.student.StudentId;
import com.ddd.domain.model.student.StudentRepository;

public class ViewingReportCardServiceImpl implements ViewingReportCardService{
	private final StudentRepository studentRepository;
	
	public ViewingReportCardServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public ReportCard getReportCard(StudentId studentId) {
		Student student = studentRepository.find(studentId);
		
		return student.reportCard();
	}
}
