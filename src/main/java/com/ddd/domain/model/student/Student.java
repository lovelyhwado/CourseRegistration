package com.ddd.domain.model.student;

import org.apache.commons.lang.Validate;

import com.ddd.domain.shared.Entity;

public class Student implements Entity<Student> {
	private StudentId studentId;
	private Schedule schedule;
	private ReportCard reportCard;
	
	public Student(final StudentId studentId) {
		Validate.notNull(studentId, "Student ID is required");
		
		this.studentId = studentId;
	}
	
	public StudentId studentId(){
		return studentId;
	}
	
	public Schedule schedule(){
		return schedule;
	}
	
	public ReportCard reportCard(){
		return reportCard;
	}
	
	public void assignSchedule(Schedule schedule){
		Validate.notNull(schedule, "schedule is required for assignment");
		
		this.schedule = schedule;
		this.reportCard = reportCard.updateReportCard(schedule);
	}
	
	@Override
	public boolean sameIdentityAs(final Student other) {
		return other != null && studentId.sameValueAs(other.studentId);
	}
	
	@Override
	public boolean equals(final Object o) {
		// TODO Auto-generated method stub
		if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;

	    final Student other = (Student) o;
	    return sameIdentityAs(other);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentId.toString();
	}
	
}
