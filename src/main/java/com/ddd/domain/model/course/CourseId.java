package com.ddd.domain.model.course;

import com.ddd.domain.shared.ValueObject;

public final class CourseId implements ValueObject<CourseId> {

	private String id;
	
	public CourseId(final String id){
		this.id = id;
	}
	@Override
	public boolean sameValueAs(CourseId other) {
		return other != null && this.id.equals(other.id);
	}

}
