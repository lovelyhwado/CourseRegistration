package com.ddd.application.impl;

import com.ddd.application.ProfessorMaintenanceService;
import com.ddd.domain.model.course.CourseOfferingRepository;
import com.ddd.domain.model.professor.Professor;
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
	public ProfessorID addNewProfessor(String professorName)
	{
	   final ProfessorID ProfessorID = professorRepository.nextProfessorID();
	   final ProfessorName ProfessorName = new ProfessorName(professorName);
	   final Professor Professor = new Professor(ProfessorID, ProfessorName);
	   professorRepository.store(Professor);
	   return Professor.getProfessorID();
	}
	
	@Override
	public void deleteProfessorCourse(ProfessorID professorID)
	{
		Professor professor = professorRepository.find(professorID);
	    professor =null;
		professorRepository.delete(professor);
		
	}
	
	@Override
	public void addProfCourse(ProfessorID professorID, String course)
	{
		Professor professor = professorRepository.find(professorID);
		professor.getCourse().add(course);
		professorRepository.store(professor); // update or save
		
	}
	@Override
	public void delProfCourse(ProfessorID professorID, String course)
	{
		Professor professor = professorRepository.find(professorID);
		professor.getCourse().remove(course);
		professorRepository.store(professor);
	}
	@Override
	public Professor getProfessor(ProfessorID professorid)
	{
		Professor professor = professorRepository.find(professorid);
		return professor;
	}

}
