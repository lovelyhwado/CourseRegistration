package com.ddd.domain.service.impl;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.course.Roster;
import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.Student;
import com.ddd.domain.service.CourseRegistrationService;

public class CourseRegistrationServiceImpl implements CourseRegistrationService {

	@Override
	public void AddStudentToRoster(List<CourseOffering> courseOfferings, Student student) {
		// TODO Auto-generated method stub
		for (CourseOffering courseOffering : courseOfferings) {
			List<Student> students = courseOffering.roster().students();
			students.add(student);
			courseOffering.setRoster(new Roster(students));
		}
	}

	@Override
	public void deleteStudentFromRoster(List<CourseOffering> courseOfferings, Student student) {
		// TODO Auto-generated method stub
		for (CourseOffering courseOffering : courseOfferings) {
			List<Student> students = courseOffering.roster().students();
			students.remove(student);
			courseOffering.setRoster(new Roster(students));
		}
	}

	@Override
	public ReportCard fetchReportCardForCourseOfferings(List<CourseOffering> courseOfferings) {
		// TODO Auto-generated method stub
		return null;
	}

}
