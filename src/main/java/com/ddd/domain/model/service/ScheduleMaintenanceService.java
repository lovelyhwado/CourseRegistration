package com.ddd.domain.model.service;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.student.Schedule;

public interface ScheduleMaintenanceService {
	Schedule createSchedule(List<CourseOffering> courseOfferings);
}
