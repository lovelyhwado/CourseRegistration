package com.ddd.application.impl;

import java.util.Date;

import com.ddd.application.StudentMaintenanceService;
import com.ddd.domain.model.course.CourseOfferingRepository;
import com.ddd.domain.model.student.DateOfBirth;
import com.ddd.domain.model.student.Name;
import com.ddd.domain.model.student.Student;
import com.ddd.domain.model.student.StudentId;
import com.ddd.domain.model.student.StudentRepository;

public class StudentMaintenanceServiceImpl implements StudentMaintenanceService {
	private final StudentRepository studentRepository;
	
	public StudentMaintenanceServiceImpl(final StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	private StudentId addNewStudent(Name name, DateOfBirth dateOfBirth) {
		final StudentId studentId = studentRepository.nextStudentId();
		
		final Student student = new Student(studentId, name, dateOfBirth);
		
		studentRepository.store(student);
		
		return student.studentId();
	}
	private void updateStudent(StudentId studentId, Name name, DateOfBirth dateOfBirth){
		Student student = studentRepository.find(studentId);
		
		if(!student.name().sameValueAs(name)){
			student.setName(name);
		}
		
		if(!student.dateOfBirth().sameValueAs(dateOfBirth)){
			student.setDateOfBirth(dateOfBirth);;
		}
		
		studentRepository.store(student);
	}
	
	private void deleteStudent(StudentId studentId){
		studentRepository.delete(studentId);
	}

	@Override
	public StudentId addNewStudent(String name, Date dateOfBirth) {
		// TODO Auto-generated method stub
		return addNewStudent(new Name(name), new DateOfBirth(dateOfBirth));
	}

	@Override
	public void updateStudent(String studentId, String name, Date dateOfBirth) {
		updateStudent(new StudentId(studentId), new Name(name), new DateOfBirth(dateOfBirth));
		
	}

	@Override
	public void deleteStudent(String studentId) {
		deleteStudent(new StudentId(studentId));
		
	}
}
