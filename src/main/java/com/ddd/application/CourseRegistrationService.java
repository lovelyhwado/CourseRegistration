package com.ddd.application;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.course.CourseOfferingId;
import com.ddd.domain.model.student.StudentId;

public interface CourseRegistrationService {
	public List<CourseOffering> requestPossibleCourseOfferings();
	
	public void createSchedule(StudentId studentId, List<CourseOfferingId> courseOfferingIds);
	public void updateSchedule(StudentId studentId, List<CourseOfferingId> courseOfferingIds);
	public void deleteSchedule(StudentId studentId);
}
