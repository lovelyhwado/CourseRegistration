package com.ddd.domain.model.professor;

import com.ddd.domain.shared.Entity;


public class Professor implements Entity<Professor> {
	
	private ProfessorID professorID;
	
	public Professor(final ProfessorID ProfessorID) 
	{
		 // Validate(ProfessorID, "Tracking ID is required");
		    this.professorID = ProfessorID;
		  
	}	
	public ProfessorID professorID()
	{
		return professorID;
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
