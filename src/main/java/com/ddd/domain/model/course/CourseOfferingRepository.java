package com.ddd.domain.model.course;

import java.util.List;

public interface CourseOfferingRepository {
	
	CourseOffering find(CourseOfferingId courseOfferingId);

	List<CourseOffering> findAll();
	List<CourseOffering> findToTeach();
	
	void updateCourseOffering(CourseOffering courseOffering);
}
