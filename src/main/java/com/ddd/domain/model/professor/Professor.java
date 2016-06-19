package com.ddd.domain.model.professor;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.Validate;

import com.ddd.domain.model.course.Course;
import com.ddd.domain.shared.Entity;


public class Professor implements Entity<Professor> {
	
	private ProfessorID professorID;
	private ProfessorName professorName;
	private List<String> Course = Collections.emptyList();
    
	public Professor(final ProfessorID ProfessorID, final ProfessorName ProfessorName) 
	{
		    Validate.notNull(ProfessorID, "ProfessorID is required");
		    Validate.notNull(ProfessorName, "ProfessorName is required");
		    
		    this.setProfessorID(ProfessorID);
		    this.professorName = ProfessorName;
		  
	}	
	public ProfessorID professorID()
	{
		return getProfessorID();
	}
	public ProfessorName professorName()
	{
		return professorName;
	}
	public List<String> getCourse()
	{
		return Course;
	}
	
	@Override
	public int hashCode() 
	{
	    return getProfessorID().hashCode();
	}

	@Override
	public String toString() 
	{
	    return getProfessorID().toString();
	}
	
	@Override
	public boolean sameIdentityAs(Professor other) {
		// TODO Auto-generated method stub
		return other !=null && getProfessorID().sameValueAs(other.getProfessorID());
	
	}
	public ProfessorID getProfessorID() {
		return professorID;
	}
	public void setProfessorID(ProfessorID professorID) {
		this.professorID = professorID;
	}
	
	Long id;
	

}
