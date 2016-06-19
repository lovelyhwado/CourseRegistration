package com.ddd;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ddd.application.impl.LoginServiceImpl;
import com.ddd.application.impl.StudentMaintenanceServiceImpl;
import com.ddd.domain.model.student.Student;
import com.ddd.infrastructure.persistence.hibernate.ProfessorRepositoryHibernate;
import com.ddd.infrastructure.persistence.hibernate.StudentRepositoryHibernate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CourseRegistrationApplication.class)
@ContextConfiguration(value = { "/context-infrastructure-persistence.xml" })
@WebAppConfiguration
public class CourseRegistrationApplicationTests {

	@Test
	@Transactional
	public void contextLoads() {
		try {
			StudentMaintenanceServiceImpl studentMaintenanceServiceImpl = new StudentMaintenanceServiceImpl(
					new StudentRepositoryHibernate());
			studentMaintenanceServiceImpl.addNewStudent("Kim Gayeon", new Date());
			LoginServiceImpl loginService = new LoginServiceImpl(new StudentRepositoryHibernate(), new ProfessorRepositoryHibernate());
			Student student = loginService.loginStudent("123");
			System.out.println(student.studentId().toString());
//			studentMaintenanceServiceImpl.
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
