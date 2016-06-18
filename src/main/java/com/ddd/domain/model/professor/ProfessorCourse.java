package com.ddd.domain.model.professor;

import org.apache.commons.lang.Validate;

import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.Schedule;
import com.ddd.domain.shared.ValueObject;

public class ProfessorCourse implements ValueObject<ProfessorCourse>{
	  private String Coursename;
	  
	  public ProfessorCourse(String name) 
	  {
		 this.Coursename = name;
  	
	  }	
	  
	  @Override
	  public boolean sameValueAs(final ProfessorCourse other) {
	    return other != null && this.Coursename.equals(other.Coursename);
	  }

}
