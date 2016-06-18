package com.ddd.domain.model.student;

import org.apache.commons.lang.Validate;

import com.ddd.domain.shared.ValueObject;

public class Name implements ValueObject<Name> {
	private final String name;
	
	public Name(String name) {
		Validate.notNull(name);
		this.name = name;
	}
	
	@Override
	public boolean sameValueAs(Name other) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
