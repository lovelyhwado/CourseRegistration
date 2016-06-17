package com.ddd.domain.model.student;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.Validate;

import com.ddd.domain.shared.ValueObject;

public class ReportCard implements ValueObject<ReportCard> {
	private List<Grade> grades = Collections.emptyList();
	
	public ReportCard(Schedule schedule) {
		// TODO Auto-generated constructor stub
		
	}
	
	ReportCard updateReportCard(Schedule schedule){
		Validate.notNull(schedule, "schedule is required for assignment");
		return new ReportCard(schedule);
	}
	
	@Override
	public boolean sameValueAs(ReportCard other) {
		return other != null && grades.equals(other.grades);
	}

	@Override
	public int hashCode() {
		return grades.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;

	    final ReportCard itinerary = (ReportCard) o;

	    return sameValueAs(itinerary);
	}
	
	
}
