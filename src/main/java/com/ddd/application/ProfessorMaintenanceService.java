package com.ddd.application;

import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.professor.ProfessorID;

public interface ProfessorMaintenanceService {

	ProfessorID addNewProfessor(String professorName);
	void deleteProfessorCourse(ProfessorID professorID);
	void addProfCourse(ProfessorID professorID, String course);
	void delProfCourse(ProfessorID professorID, String course);
	
}
