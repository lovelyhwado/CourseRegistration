package com.ddd.domain.service;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.Schedule;

public interface StudentMaintenanceService {
	public ReportCard fetchReportCardForCourseOfferings(List<CourseOffering> courseOfferings);
	public ReportCard addCourseOfferingsToReportCard(List<CourseOffering> courseOfferings, ReportCard reportCard);
	public ReportCard deleteCourseOfferingsFromReportCard(List<CourseOffering> courseOfferings, ReportCard reportCard);
	
	public Schedule fetchScheduleForCourseOfferings(List<CourseOffering> courseOfferings);
}
