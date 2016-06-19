package com.ddd.application;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.professor.ProfessorID;

public interface SelectToTeachService {
	CourseOffering setLecturerOfCourseOffering(CourseOffering courseOffering, ProfessorID professorID);
}
