package com.ddd.infrastructure.persistence.hibernate;

import java.util.List;
import java.util.UUID;

import org.springframework.transaction.annotation.Transactional;

import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.professor.ProfessorID;
import com.ddd.domain.model.professor.ProfessorRepository;

public class ProfessorRepositoryHibernate extends HibernateRepository implements ProfessorRepository{
	  
	  @Override
	  @Transactional
	  public Professor find(ProfessorID ProfessorID)
	  {
		  return (Professor) getSession().
			      createQuery("from Professor where trackingId = :ProfessorID").
			      setParameter("tid", ProfessorID).
			      uniqueResult();
	  }
	  @Override
	  @Transactional
	  public List<ProfessorID> findAll()
	  {
		return null;
		  
	  }

	  @Override
	  @Transactional
	  public void store(Professor professor)
	  {
		  getSession().saveOrUpdate(professor);
		 
	  }
	  
	  @Override
	  @Transactional
	  public void delete(Professor Professor)
	  {
		  getSession().delete(Professor);
	  }
	  
	  @Override
	  @Transactional
	  public ProfessorID nextProfessorID()
	  {
		   
		    final String random = UUID.randomUUID().toString().toUpperCase();
		    return new ProfessorID(
		      random.substring(0, random.indexOf("-"))
		    );
	  }
}