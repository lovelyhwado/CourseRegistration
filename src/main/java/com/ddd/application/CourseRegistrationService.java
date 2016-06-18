package com.ddd.application;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;

public interface CourseRegistrationService {
	public List<CourseOffering> requestPossibleCourseOfferings();
}
