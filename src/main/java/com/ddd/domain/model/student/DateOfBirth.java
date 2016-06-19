package com.ddd.domain.model.student;

import java.util.Date;

import com.ddd.domain.shared.ValueObject;

public class DateOfBirth implements ValueObject<DateOfBirth>{
	private final Date dateOfBirth;
	
	public DateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	DateOfBirth () {
		this.dateOfBirth = new Date();
	}
	@Override
	public boolean sameValueAs(DateOfBirth other) {
		// TODO Auto-generated method stub
		return false;
	}

}
