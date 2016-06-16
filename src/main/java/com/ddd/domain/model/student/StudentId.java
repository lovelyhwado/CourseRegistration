package com.ddd.domain.model.student;

import org.apache.commons.lang.Validate;

import com.ddd.domain.shared.ValueObject;


public class StudentId implements ValueObject<StudentId> {
	private String id;
	
	public StudentId(final String id) {
		Validate.notNull(id);
		this.id = id;
	}
	@Override
	public boolean sameValueAs(StudentId other) {
		// TODO Auto-generated method stub
		return false;
	}
}
