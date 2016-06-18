package com.ddd.domain.model.course;

import java.util.List;

public interface CourseOfferingRepository {
	
	CourseOffering find(CourseOfferingId courseOfferingId);

	List<CourseOfferingId> findAll();
	List<CourseOfferingId> findToTeach();
}
