package com.ddd.domain.model.course;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.Validate;

import com.ddd.domain.shared.ValueObject;
import com.ddd.domain.model.student.Student;

public class Roster implements ValueObject<Roster> {

	private List<Student> students = Collections.emptyList();
	
	public Roster(List<Student> students){
		Validate.notNull(students);
		Validate.noNullElements(students);
		
		this.students = students;
	}
	
	public List<Student> students() {
		return students;
	}
	
	
	
	@Override
	public boolean sameValueAs(Roster other) {
		// TODO Auto-generated method stub
		return other != null && students.equals(other.students);
	}
	
	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		final Roster roster = (Roster) o;
	
		return sameValueAs(roster);
	}

	@Override
	public int hashCode() {
		return students.hashCode();
	}
	
	Roster () {
		
	}
	
}
