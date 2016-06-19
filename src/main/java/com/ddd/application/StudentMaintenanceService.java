package com.ddd.application;

import com.ddd.domain.model.student.DateOfBirth;
import com.ddd.domain.model.student.Name;
import com.ddd.domain.model.student.StudentId;

public interface StudentMaintenanceService {
	StudentId addNewStudent(final Name name, final DateOfBirth dateOfBirth);
	public void updateStudent(StudentId studentId, Name name, DateOfBirth dateOfBirth);
	public void deleteStudent(StudentId studentId);
}
