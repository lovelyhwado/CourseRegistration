package com.ddd.application.impl;

import java.util.Date;

import com.ddd.application.StudentMaintenanceService;
import com.ddd.domain.model.course.CourseOfferingRepository;
import com.ddd.domain.model.student.StudentId;
import com.ddd.domain.model.student.StudentRepository;

public class StudentMaintenanceServiceImpl implements StudentMaintenanceService {
	private final StudentRepository studentRepository;
	private final CourseOfferingRepository courseOfferingRepository;
	
	public StudentMaintenanceServiceImpl(final StudentRepository studentRepository,
			final CourseOfferingRepository courseOfferingRepository) {
		this.studentRepository = studentRepository;
		this.courseOfferingRepository = courseOfferingRepository;
	}
	
	@Override
	public StudentId addNewStudent(String name, Date dateOfBirth) {
		// TODO Auto-generated method stub
		return null;
	}

}
