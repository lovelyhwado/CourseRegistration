package com.ddd.infrastructure.persistence.hibernate;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.course.CourseOfferingId;
import com.ddd.domain.model.course.CourseOfferingRepository;

public class CourseOfferingRepositoryHibernate extends HibernateRepository implements CourseOfferingRepository {

	@Override
	public CourseOffering find(CourseOfferingId courseOfferingId) {
		// TODO Auto-generated method stub
		return (CourseOffering) getSession()
				.createQuery("from CourseOffering where id = :courseOfferingId")
				.setParameter("courseOfferingId", courseOfferingId)
				.uniqueResult();
	}

	@Override
	public List<CourseOfferingId> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseOfferingId> findToTeach() {
		// TODO Auto-generated method stub
		return null;
	}

}