package com.ddd.application;

import java.util.Date;

import com.ddd.domain.model.student.StudentId;

public interface StudentMaintenanceService {
	public StudentId addNewStudent(final String name, final Date dateOfBirth);
	public void updateStudent(String studentId, String name, Date dateOfBirth);
	public void deleteStudent(String studentId);
}
