package com.ddd.application.impl;

import com.ddd.application.ProfessorMaintenanceService;
import com.ddd.domain.model.course.CourseOfferingRepository;
import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.professor.ProfessorCourse;
import com.ddd.domain.model.professor.ProfessorID;
import com.ddd.domain.model.professor.ProfessorName;
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
	public Professor addNewProfessor(String professorID, String professorCourse, String professorName)
	{
	   final ProfessorID ProfessorID = new ProfessorID(professorID);
	   final ProfessorName ProfessorName = new ProfessorName(professorName);
	   final ProfessorCourse ProfessorCourse = new ProfessorCourse(professorCourse);
	   final Professor Professor = new Professor(ProfessorID,ProfessorCourse, ProfessorName);
	   return Professor;
	}
	
	@Override
	public void deleteProfessorCourse(Professor professor)
	{
		professor = null;
		
	}

}
