package com.ddd.application.impl;

import com.ddd.application.ProfessorMaintenanceService;
import com.ddd.application.SelectToTeachService;
import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.course.CourseOfferingRepository;
import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.professor.ProfessorID;

public class SelectToTeachServiceImpl implements SelectToTeachService {
   
	private final CourseOfferingRepository courseOfferingRepository;
	private final ProfessorMaintenanceService ProfessorManage;
	
	public SelectToTeachServiceImpl(final ProfessorMaintenanceService ProfessorManage,
			final CourseOfferingRepository courseOfferingRepository) {
		this.ProfessorManage = ProfessorManage;
		this.courseOfferingRepository = courseOfferingRepository;
	}
	@Override
    public CourseOffering setLecturerOfCourseOffering(CourseOffering courseOffering, ProfessorID professorID)
	{
		final Professor professor = ProfessorManage.getProfessor(professorID);
		 courseOffering.setProfessor(professor);
    	return courseOffering;
	}
}
