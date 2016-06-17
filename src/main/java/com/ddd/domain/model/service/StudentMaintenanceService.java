package com.ddd.domain.model.service;

import com.ddd.domain.model.student.StudentId;

public interface StudentMaintenanceService {
	StudentId add();
	StudentId update();
	void delete();
}
