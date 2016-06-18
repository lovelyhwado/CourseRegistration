package com.ddd.application;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.student.Student;

public interface CourseRegistrationService {
	public List<CourseOffering> requestPossibleCourseOfferings();
	CourseOffering AddStudentToRoster(CourseOffering courseOffering, Student student);
}
