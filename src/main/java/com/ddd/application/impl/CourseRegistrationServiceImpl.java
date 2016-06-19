package com.ddd.application.impl;

import java.util.Collections;
import java.util.List;

import com.ddd.application.CourseRegistrationService;
import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.course.CourseOfferingId;
import com.ddd.domain.model.course.CourseOfferingRepository;
import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.Schedule;
import com.ddd.domain.model.student.Student;
import com.ddd.domain.model.student.StudentId;
import com.ddd.domain.model.student.StudentRepository;
import com.ddd.domain.service.ScheduleMaintenanceService;
import com.ddd.domain.service.StudentMaintenanceService;

public class CourseRegistrationServiceImpl implements CourseRegistrationService {
	private final StudentRepository studentRepository;
	private final CourseOfferingRepository courseOfferingRepository;
	private final ScheduleMaintenanceService scheduleMaintenanceService;
	private final StudentMaintenanceService studentMaintenanceService;
	private final com.ddd.domain.service.CourseRegistrationService courseRegistrationService;
	
	public CourseRegistrationServiceImpl(StudentRepository studentRepository, 
			CourseOfferingRepository courseOfferingRepository,
			ScheduleMaintenanceService scheduleMaintenanceService,
			StudentMaintenanceService studentMaintenanceService,
			com.ddd.domain.service.CourseRegistrationService courseRegistrationService) {
		// TODO Auto-generated constructor stub
		this.studentRepository = studentRepository;
		this.courseOfferingRepository = courseOfferingRepository;
		this.scheduleMaintenanceService = scheduleMaintenanceService;
		this.studentMaintenanceService = studentMaintenanceService;
		this.courseRegistrationService = courseRegistrationService;
	}
	@Override
	public List<CourseOffering> requestPossibleCourseOfferings() {
		// TODO Auto-generated method stub
		List<CourseOffering> courseOfferings = courseOfferingRepository.findAll();
		return courseOfferings;
	}
	
	@Override
	public void createSchedule(StudentId studentId, List<CourseOfferingId> courseOfferingIds) {
		// TODO Auto-generated method stub
		Student student = studentRepository.find(studentId);
		List<CourseOffering> courseOfferings = Collections.emptyList();
		Schedule schedule = new Schedule(courseOfferings);
		ReportCard reportCard = studentMaintenanceService.fetchReportCardForCourseOfferings(courseOfferings);

		student.assignSchedule(schedule);
		student.assignReportCard(reportCard);
		
		courseRegistrationService.AddStudentToRoster(courseOfferings, student);
		
		studentRepository.store(student);
	}
	
	@Override
	public void updateSchedule(StudentId studentId, List<CourseOfferingId> courseOfferingIds) {
		// TODO Auto-generated method stub
		Student student = studentRepository.find(studentId);
		List<CourseOffering> courseOfferings = Collections.emptyList();
		Schedule schedule = new Schedule(courseOfferings);
		
		
		
//		student.assignSchedule(schedule);
//		studentRepository.update(student);
		
	}
	
	@Override
	public void deleteSchedule(StudentId studentId) {
		// TODO Auto-generated method stub
		Student student = studentRepository.find(studentId);
		List<CourseOffering> courseOfferings = student.schedule().courseOfferings();
		
		courseRegistrationService.deleteStudentFromRoster(courseOfferings ,student);
		
		student.unassignSchedule();
		student.unassignReportCard();
		
		studentRepository.store(student);
	}
}
