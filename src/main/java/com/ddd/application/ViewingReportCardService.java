package com.ddd.application;

import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.StudentId;

public interface ViewingReportCardService {
	public ReportCard getReportCard(StudentId studentId);
}
