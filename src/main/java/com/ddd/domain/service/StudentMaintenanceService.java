package com.ddd.domain.service;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.Schedule;

public interface StudentMaintenanceService {
	public Schedule fetchScheduleForCourseOfferings(List<CourseOffering> courseOfferings);
	public ReportCard fetchReportCardForCourseOfferings(List<CourseOffering> courseOfferings);
}
