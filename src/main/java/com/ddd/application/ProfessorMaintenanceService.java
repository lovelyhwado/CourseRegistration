package com.ddd.application;

import com.ddd.domain.model.professor.ProfessorCourse;
import com.ddd.domain.model.professor.ProfessorID;

public interface ProfessorMaintenanceService {

	ProfessorID addNewProfessorID(String name);
	ProfessorCourse addNewProfessorCourseCourse(String name, String time);
	
}
