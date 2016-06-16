package com.ddd.domain.model.professor;

import java.util.List;

public interface ProfessorRepository {
	

	  /**
	   * Finds a cargo using given id.
	   *
	   * @param trackingId Id
	   * @return Cargo if found, else {@code null}
	   */
	  Professor find(ProfessorID ProfessorID);

	  /**
	   * Finds all cargo.
	   *
	   * @return All cargo.
	   */
	  List<ProfessorID> findAll();

	  /**
	   * Saves given cargo.
	   *
	   * @param cargo cargo to save
	   */
	  void store(Professor professor);

	  /**
	   * @return A unique, generated tracking Id.
	   */
	  Professor nextTrackingId();

}


