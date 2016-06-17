package com.ddd.domain.model.student;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.Validate;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.shared.ValueObject;

public class Schedule implements ValueObject<Schedule>{
	
	private List<CourseOffering> courseOfferings = Collections.emptyList();
	
	public Schedule(final List<CourseOffering> courseOfferings) {
		Validate.notNull(courseOfferings, "Course offerings is required");
		Validate.noNullElements(courseOfferings);
		
		this.courseOfferings = courseOfferings;
	}
	@Override
	public boolean sameValueAs(Schedule other) {
		// TODO Auto-generated method stub
		return other != null && courseOfferings.equals(other.courseOfferings);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return courseOfferings.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		final Schedule schedule = (Schedule) o;
		
		return sameValueAs(schedule);
	}
}
