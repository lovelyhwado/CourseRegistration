package com.ddd.domain.model.service;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.student.Schedule;
import com.ddd.domain.model.student.StudentId;

public interface ScheduleMaintenanceService {
	Schedule add(StudentId studentId, List<CourseOffering> courseOfferings);
	Schedule update(StudentId studentId, List<CourseOffering> courseOfferings);
	Schedule delete(StudentId studentId);
}
