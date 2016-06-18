package com.ddd.domain.model.course;

import org.apache.commons.lang.Validate;

import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.shared.Entity;
import com.ddd.domain.shared.ValueObject;

public class CourseOffering implements Entity<CourseOffering> {
	
	private CourseOfferingId courseOfferingId;
	private Course course;
	private Roster roster;
	private Day day;
	private Period period;
	private Professor lecturer;
	
	public enum Day implements ValueObject<Day> {
		MON, TUE, WED, THUR, FRI, SAT;

		@Override
		public boolean sameValueAs(Day other) {
			// TODO Auto-generated method stub
			return this.equals(other);
		}
	}
	
	public enum Period implements ValueObject<Period> {
		FIRST, SECOND, THIRD, FORTH, FIFTH, SIXTH, SEVENTH, EIGHTH;

		@Override
		public boolean sameValueAs(Period other) {
			// TODO Auto-generated method stub
			return this.equals(other);
		}
		
	}
	
	public CourseOffering(final CourseOfferingId courseOfferingId, final Course course,
			final Day day, final Period period) {
		Validate.notNull(courseOfferingId);
		Validate.notNull(course);
		this.courseOfferingId = courseOfferingId;
		this.course = course;
		this.roster = new Roster();
		this.day = day;
		this.period = period;
	}
	
	public void setRoster(Roster roster) {
		this.roster = roster;
	}
	
	public void setProfessor(Professor professor) {
		this.lecturer = professor;
	}
	
	public boolean canSelectToTeach(){
		return lecturer == null;
	}
	
	@Override
	public boolean sameIdentityAs(CourseOffering other) {
		// TODO Auto-generated method stub
		return other != null && courseOfferingId.sameValueAs(other.courseOfferingId);
	}
	
	public boolean sameCourseAs(CourseOffering other) {
		return other!= null && course.sameValueAs(other.course);
	}
}
