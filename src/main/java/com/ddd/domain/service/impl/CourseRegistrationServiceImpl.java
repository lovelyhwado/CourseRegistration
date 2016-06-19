package com.ddd.domain.service.impl;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.course.CourseOfferingRepository;
import com.ddd.domain.model.course.Roster;
import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.Student;
import com.ddd.domain.service.CourseRegistrationService;

public class CourseRegistrationServiceImpl implements CourseRegistrationService {
	
	private final CourseOfferingRepository courseOfferingRepository;
	
	public CourseRegistrationServiceImpl(final CourseOfferingRepository courseOfferingRepository) {
		this.courseOfferingRepository = courseOfferingRepository;
	}
	
	@Override
	public void AddStudentToRoster(List<CourseOffering> courseOfferings, Student student) {
		// TODO Auto-generated method stub
		for (CourseOffering courseOffering : courseOfferings) {
			List<Student> students = courseOffering.roster().students();
			students.add(student);
			courseOffering.setRoster(new Roster(students));
			courseOfferingRepository.updateCourseOffering(courseOffering);
		}
	}

	@Override
	public void deleteStudentFromRoster(List<CourseOffering> courseOfferings, Student student) {
		// TODO Auto-generated method stub
		for (CourseOffering courseOffering : courseOfferings) {
			List<Student> students = courseOffering.roster().students();
			students.remove(student);
			courseOffering.setRoster(new Roster(students));
			courseOfferingRepository.updateCourseOffering(courseOffering);
		}
	}
}
