package com.ddd.domain.model.professor;

import org.apache.commons.lang.Validate;

import com.ddd.domain.shared.Entity;


public class Professor implements Entity<Professor> {
	
	private ProfessorID professorID;
	private ProfessorCourse professorCourse;
	private ProfessorName professorName;
    
	public Professor(final ProfessorID ProfessorID, final ProfessorCourse ProfessorCourse, final ProfessorName ProfessorName) 
	{
		    Validate.notNull(ProfessorID, "ProfessorID is required");
		    Validate.notNull(ProfessorCourse, "ProfessorCourse ID is required");
		    Validate.notNull(ProfessorName, "ProfessorName is required");
		    
		    this.professorID = ProfessorID;
		    this.professorCourse = ProfessorCourse;
		    this.professorName = ProfessorName;
		  
	}	
	public ProfessorID professorID()
	{
		return professorID;
	}
	public ProfessorCourse professorCourse()
	{
		return professorCourse;
	}
	public ProfessorName professorName()
	{
		return professorName;
	}
	
	@Override
	public int hashCode() 
	{
	    return professorID.hashCode();
	}

	@Override
	public String toString() 
	{
	    return professorID.toString();
	}
	
	@Override
	public boolean sameIdentityAs(Professor other) {
		// TODO Auto-generated method stub
		return other !=null && professorID.sameValueAs(other.professorID);
	
	}
}
