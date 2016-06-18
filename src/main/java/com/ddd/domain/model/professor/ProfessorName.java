package com.ddd.domain.model.professor;

import org.apache.commons.lang.Validate;

import com.ddd.domain.shared.ValueObject;



public class ProfessorName implements ValueObject<ProfessorName> {
	private final String ProfessorName;
	
	public ProfessorName(String ProfessorName) {
		Validate.notNull(ProfessorName);
		this.ProfessorName = ProfessorName;
	}
	
	@Override
	public boolean sameValueAs(ProfessorName other) {
		// TODO Auto-generated method stub
		return false;
	}
	
}