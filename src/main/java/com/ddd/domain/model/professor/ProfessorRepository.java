package com.ddd.domain.model.professor;

import java.util.List;

public interface ProfessorRepository {
	

	  Professor find(ProfessorID ProfessorID);
	  List<ProfessorID> findAll();
	  void store(Professor professor);
	  ProfessorID nextProfessorID();
	  void delete(Professor Professor);

}


