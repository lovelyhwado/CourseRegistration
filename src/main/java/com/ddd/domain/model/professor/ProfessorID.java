package com.ddd.domain.model.professor;

import com.ddd.domain.shared.ValueObject;


public class ProfessorID implements ValueObject<ProfessorID> {

	  private String id;



	  /**
	   * @return String representation of this tracking id.
	   */
	  public String idString() {
	    return id;
	  }

	  @Override
	  public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;

	    ProfessorID other = (ProfessorID) o;

	    return sameValueAs(other);
	  }

	  @Override
	  public int hashCode() {
	    return id.hashCode();
	  }

	  @Override
	  public boolean sameValueAs(final ProfessorID other) {
	    return other != null && this.id.equals(other.id);
	  }

	  @Override
	  public String toString() {
	    return id;
	  }

	  ProfessorID() {
	    // Needed by Hibernate
	  }
	  
}
