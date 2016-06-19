package com.ddd.domain.model.student;

import org.apache.commons.lang.Validate;
import com.ddd.domain.shared.ValueObject;


public class StudentId implements ValueObject<StudentId> {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StudentId(final String id) {
		Validate.notNull(id);
		this.id = id;
	}
	
	@Override
	public boolean sameValueAs(StudentId other) {
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

	    StudentId other = (StudentId) o;

	    return sameValueAs(other);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id;
	}
	
}
