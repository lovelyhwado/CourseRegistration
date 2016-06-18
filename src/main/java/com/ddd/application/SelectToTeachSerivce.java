package com.ddd.application;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.professor.Professor;

public interface SelectToTeachSerivce {
	CourseOffering setLecturerOfCourseOffering(CourseOffering courseOffering, Professor professor);
}
