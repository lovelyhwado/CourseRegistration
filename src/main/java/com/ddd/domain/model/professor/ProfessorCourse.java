package com.ddd.domain.model.professor;

import org.apache.commons.lang.Validate;

import com.ddd.domain.model.student.ReportCard;
import com.ddd.domain.model.student.Schedule;
import com.ddd.domain.shared.ValueObject;

public class ProfessorCourse implements ValueObject<ProfessorCourse>{
	  private String Coursename;
	  private String Coursetime;
		
	  public ProfessorCourse(String name, String time) 
	  {
		 this.Coursename = name;
  		 this.Coursetime = time;
	  }	
	  
	  @Override
	  public boolean sameValueAs(final ProfessorCourse other) {
	    return other != null && this.Coursename.equals(other.Coursename) &&  this.Coursetime.equals(other.Coursetime);
	  }

}
