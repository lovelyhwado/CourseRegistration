package com.ddd.domain.model.course;

import org.apache.commons.lang.Validate;

import com.ddd.domain.shared.Entity;

public class CourseOffering implements Entity<CourseOffering> {
	
	private CourseOfferingId courseOfferingId;
	private Course course;
	private Roster roster;
	
	public CourseOffering(final CourseOfferingId courseOfferingId, final Course course) {
		Validate.notNull(courseOfferingId);
		Validate.notNull(course);
		this.courseOfferingId = courseOfferingId;
		this.course = course;
		this.roster = new Roster();
	}
	
	public void setRoster(Roster roster) {
		this.roster = roster;
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
