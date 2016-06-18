package com.ddd.application.impl;

import com.ddd.application.ProfessorMaintenanceService;
import com.ddd.domain.model.course.CourseOfferingRepository;
import com.ddd.domain.model.professor.ProfessorCourse;
import com.ddd.domain.model.professor.ProfessorID;
import com.ddd.domain.model.professor.ProfessorRepository;

public class ProfessorMaintenanceServiceImpl implements ProfessorMaintenanceService{

	private final ProfessorRepository professorRepository;
	private final CourseOfferingRepository courseOfferingRepository;
	
	public ProfessorMaintenanceServiceImpl(final ProfessorRepository professorRepository,
			final CourseOfferingRepository courseOfferingRepository) {
		this.professorRepository = professorRepository;
		this.courseOfferingRepository = courseOfferingRepository;
	}
	@Override
	public ProfessorID addNewProfessorID(String name)
	{
		return null;
	}
	
	@Override
	public ProfessorCourse addNewProfessorCourseCourse(String name, String time) {
		return null;
	}

}
