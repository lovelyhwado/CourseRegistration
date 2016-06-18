package com.ddd.application;

import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.student.Student;

public interface LoginService {
	
	Student loginStudent(String studentId, String password);
	Professor loginProfessor(String professorId, String password);
	
	void loginRegistrar(String id, String password);
}
