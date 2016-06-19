package com.ddd.infrastructure.persistence.hibernate;

import java.util.List;

import com.ddd.domain.model.course.CourseOffering;
import com.ddd.domain.model.course.CourseOfferingId;
import com.ddd.domain.model.course.CourseOfferingRepository;
import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.student.Student;

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
	public List<CourseOffering> findAll() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from CourseOffering").list();
	}

	@Override
	public List<CourseOffering> findToTeach() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from CourseOffering where lecturer is not null").list();
	}

	@Override
	public void updateCourseOffering(CourseOffering courseOffering) {
		// TODO Auto-generated method stub
		getSession().update(courseOffering);
	}

}
