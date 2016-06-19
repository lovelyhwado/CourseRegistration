package com.ddd.application.impl;

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
	
	@Override
	public StudentId addNewStudent(Name name, DateOfBirth dateOfBirth) {
		final StudentId studentId = studentRepository.nextStudentId();
		
		final Student student = new Student(studentId, name, dateOfBirth);
		
		studentRepository.store(student);
		
		return student.studentId();
	}
	public void updateStudent(StudentId studentId, Name name, DateOfBirth dateOfBirth){
		Student student = studentRepository.find(studentId);
		
		if(!student.name().sameValueAs(name)){
			student.setName(name);
		}
		
		if(!student.dateOfBirth().sameValueAs(dateOfBirth)){
			student.setDateOfBirth(dateOfBirth);;
		}
		
		studentRepository.store(student);
	}
	
	public void deleteStudent(StudentId studentId){
		studentRepository.delete(studentId);
	}
}
