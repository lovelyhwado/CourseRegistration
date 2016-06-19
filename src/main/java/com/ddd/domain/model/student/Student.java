package com.ddd.domain.model.student;

import org.apache.commons.lang.Validate;
import com.ddd.domain.shared.Entity;

public class Student implements Entity<Student> {
	
	private StudentId studentId;
	private Name name;
	private DateOfBirth dateOfBirth;
	private Schedule schedule;
	private ReportCard reportCard;
	
	public Student(final StudentId studentId, final Name name, final DateOfBirth dateOfBirth) {
		Validate.notNull(studentId, "Student ID is required");
		Validate.notNull(name);
		Validate.notNull(dateOfBirth);
		
		this.studentId = studentId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public StudentId studentId(){
		return studentId;
	}
	
	public Name name(){
		return name;
	}
	
	public DateOfBirth dateOfBirth(){
		return dateOfBirth;
	}
	
	public Schedule schedule(){
		return schedule;
	}
	
	public ReportCard reportCard(){
		return reportCard;
	}
	
	public void assignSchedule(Schedule schedule){
		Validate.notNull(schedule);
		this.schedule = schedule;
	}
	
	public void unassignSchedule(){
		this.schedule = null;
	}
	
	public void assignReportCard(ReportCard reportCard){
		Validate.notNull(reportCard);
		this.reportCard = reportCard;
	}
	
	public void unassignReportCard(){
		this.reportCard = null;
	}
	
	public void setName(Name name){
		Validate.notNull(name);
		this.name = name;
	}
	
	public void setDateOfBirth(DateOfBirth dateOfBirth){
		Validate.notNull(dateOfBirth);
		this.dateOfBirth = dateOfBirth;
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
	
	Student() {
		//for hibernate
	}
	
	String id; //for hibernate
}
