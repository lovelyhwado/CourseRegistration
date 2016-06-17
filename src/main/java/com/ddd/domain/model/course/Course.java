package com.ddd.domain.model.course;

import com.ddd.domain.shared.ValueObject;

public class Course implements ValueObject<Course> {
	
	private String name;
	
	public Course(final String name) {
		this.name = name;
	}
	
	@Override
	public boolean sameValueAs(Course other) {
		// TODO Auto-generated method stub
		return other != null && name.equals(other.name);
	}


}
