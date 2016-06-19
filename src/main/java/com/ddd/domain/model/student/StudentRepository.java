package com.ddd.domain.model.student;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface StudentRepository {
	Student find(StudentId studentId);
	List<Student> findAll();
	void store(Student student);
	void delete(StudentId studentId);
	StudentId nextStudentId();
}
