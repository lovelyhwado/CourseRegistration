package com.ddd.application;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.student.Student;

public interface CourseRegistrationService {
	
	CourseOffering AddStudentToRoster(CourseOffering courseOffering, Student student);
}
