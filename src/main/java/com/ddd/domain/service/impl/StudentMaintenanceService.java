package com.ddd.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.student.Grade;
import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.Schedule;

public class StudentMaintenanceService implements com.ddd.domain.service.StudentMaintenanceService {

	@Override
	public ReportCard fetchReportCardForCourseOfferings(List<CourseOffering> courseOfferings) {
		List<Grade> grades = new ArrayList<Grade>();
		for (CourseOffering courseOffering : courseOfferings) {
			grades.add(new Grade(courseOffering, null));
		}
		return new ReportCard(grades);
	}

	@Override
	public ReportCard addCourseOfferingsToReportCard(List<CourseOffering> courseOfferings, ReportCard reportCard) {
		List<Grade> grades = reportCard.grades();
		for(CourseOffering courseOffering : courseOfferings){
			for(Grade grade : grades){
				if(grade.courseOffering().sameCourseAs(courseOffering)){
					continue;
				}
			}
			grades.add(new Grade(courseOffering, null));
		}
		return reportCard;
	}

	@Override
	public ReportCard deleteCourseOfferingsFromReportCard(List<CourseOffering> courseOfferings, ReportCard reportCard) {
		List<Grade> grades = reportCard.grades();
		for(Grade grade: grades){
			for (CourseOffering courseOffering : courseOfferings){
				if(grade.courseOffering().sameCourseAs(courseOffering)){
					grades.remove(grade);
					continue;
				}
			}
		}
		return reportCard;
	}

	@Override
	public Schedule fetchScheduleForCourseOfferings(List<CourseOffering> courseOfferings) {
		//check if there are conflicts
		return new Schedule(courseOfferings);
	}
}
