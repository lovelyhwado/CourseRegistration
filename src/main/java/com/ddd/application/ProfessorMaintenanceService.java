package com.ddd.application;

import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.professor.ProfessorCourse;
import com.ddd.domain.model.professor.ProfessorID;

public interface ProfessorMaintenanceService {

	Professor addNewProfessor(String ProfessorID, String professorCourse, String professorName);
	void deleteProfessorCourse(Professor professor);
	
}
