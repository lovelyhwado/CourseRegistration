package com.ddd.infrastructure.persistence.hibernate;

import java.util.List;
import java.util.UUID;

import org.springframework.transaction.annotation.Transactional;

import com.ddd.domain.model.student.Student;
import com.ddd.domain.model.student.StudentId;
import com.ddd.domain.model.student.StudentRepository;


public class StudentRepositoryHibernate extends HibernateRepository implements StudentRepository {

	@Override
	@Transactional
	public Student find(StudentId studentId) {
		// TODO Auto-generated method stub
		return (Student) getSession()
				.createQuery("from Student where studentId = :studentId")
				.setParameter("studentId", studentId.toString())
				.uniqueResult();
	}

	@Override
	@Transactional
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Student").list();
	}

	@Override
	@Transactional
	public void store(Student student) {
		getSession().saveOrUpdate(student);
	}

	@Override
	@Transactional
	public void delete(StudentId studentId) {
		getSession().createQuery("delete from Student where studentId = :studentId")
					.setParameter("studentId", studentId.toString())
					.executeUpdate();
	}

	@Override
	public StudentId nextStudentId() {
		final String random = UUID.randomUUID().toString().toUpperCase();
		return new StudentId(
			random.substring(0, random.indexOf("-"))
		);
	}

}
