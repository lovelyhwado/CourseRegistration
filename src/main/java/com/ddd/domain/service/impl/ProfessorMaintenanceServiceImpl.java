package com.ddd.domain.service.impl;

import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.service.ProfessorMaintenanceService;

public class ProfessorMaintenanceServiceImpl implements ProfessorMaintenanceService{
	@Override
	public void CourseAdd(Professor professor, String course)
	{	
		professor.getCourse().add(course);
	}
	@Override
	public void Coursedelete(Professor professor, String course)
	{
		professor.getCourse().remove(course);
	}
	

}
