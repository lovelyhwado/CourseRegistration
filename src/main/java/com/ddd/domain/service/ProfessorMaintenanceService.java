package com.ddd.domain.service;

import com.ddd.domain.model.professor.ProfessorID;

public interface ProfessorMaintenanceService {
	ProfessorID add();
	ProfessorID delete();
	ProfessorID update();
}
