package com.ddd.application.impl;

import com.ddd.application.LoginService;
import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.professor.ProfessorID;
import com.ddd.domain.model.professor.ProfessorRepository;
import com.ddd.domain.model.student.Student;
import com.ddd.domain.model.student.StudentId;
import com.ddd.domain.model.student.StudentRepository;

public class LoginServiceImpl implements LoginService{

	private final StudentRepository studentRepository;
	private final ProfessorRepository professorRepository;
	
	public LoginServiceImpl (final StudentRepository studentRepository, 
			final ProfessorRepository professorRepository) {
		this.studentRepository = studentRepository;
		this.professorRepository = professorRepository;
	}
	
	@Override
	public Student loginStudent(String studentId) {
		// TODO Auto-generated method stub
		Student student = studentRepository.find(new StudentId(studentId));
		return student;
	}

	@Override
	public Professor loginProfessor(String professorId) {
		// TODO Auto-generated method stub
		Professor professor = professorRepository.find(new ProfessorID(professorId));
		return professor;
	}

}
