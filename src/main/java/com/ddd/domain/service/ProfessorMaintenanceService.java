package com.ddd.domain.service;

import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.professor.ProfessorID;

public interface ProfessorMaintenanceService {
	void CourseAdd(Professor professer, String course);
	void Coursedelete(Professor professer, String course);
	
	
}
