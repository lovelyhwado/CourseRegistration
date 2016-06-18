package com.ddd.application;

import java.util.Date;

import com.ddd.domain.model.student.StudentId;

public interface StudentMaintenanceService {
	StudentId addNewStudent(final String name, final Date dateOfBirth);
	
}
