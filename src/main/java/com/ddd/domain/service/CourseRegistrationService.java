package com.ddd.domain.service;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.Student;

public interface CourseRegistrationService {
	public CourseOffering AddStudentToRoster(List<CourseOffering> courseOfferings, Student student);
	public void deleteStudentFromRoster(List<CourseOffering> courseOfferings, Student student);
//	public ReportCard fetchReportCardForCourseOfferings(List<CourseOffering> courseOfferings);
}
