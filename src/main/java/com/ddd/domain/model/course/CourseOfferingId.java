package com.ddd.domain.model.course;

import com.ddd.domain.shared.ValueObject;
import org.apache.commons.lang.Validate;

public final class CourseOfferingId implements ValueObject<CourseOfferingId> {

	private String id;
	
	public CourseOfferingId(final String id) {
		Validate.notNull(id);
		this.id = id;
	}

	@Override
	public boolean sameValueAs(CourseOfferingId other) {
		return other != null && id.equals(other.id);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;

	    CourseOfferingId other = (CourseOfferingId) o;

	    return sameValueAs(other);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id;
	}
}
