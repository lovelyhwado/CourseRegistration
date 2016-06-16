package com.ddd.domain.model.student;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.ddd.domain.shared.ValueObject;

public class Grade implements ValueObject<Grade> {
	
	private GradeValue gradeValue;
	
	@Override
	public boolean sameValueAs(Grade other) {
		return other != null && new EqualsBuilder().
				append(this.gradeValue, other.gradeValue).
				isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().
				append(gradeValue).
				toHashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		final Grade other = (Grade) o;
		
		return sameValueAs(other);
	}
}
