package com.ddd.domain.model.student;

import com.ddd.domain.shared.ValueObject;

public enum GradeValue implements ValueObject<GradeValue>{
	A, B, C, D, E, F, I;
	@Override
	public boolean sameValueAs(GradeValue other) {
		// TODO Auto-generated method stub
		return this.equals(other);
	}
}