package com.ddd.domain.service;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.student.ReportCard;

public interface StudentMaintenanceService {
	public ReportCard fetchReportCardForCourseOfferings(List<CourseOffering> courseOfferings);
}
