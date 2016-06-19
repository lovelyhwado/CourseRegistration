package com.ddd;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ddd.application.impl.StudentMaintenanceServiceImpl;
import com.ddd.infrastructure.persistence.hibernate.StudentRepositoryHibernate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CourseRegistrationApplication.class)
@ContextConfiguration(value = {"/context-infrastructure-persistence.xml"})
@WebAppConfiguration
public class CourseRegistrationApplicationTests {

	@Test
	public void contextLoads() {
		StudentMaintenanceServiceImpl studentMaintenanceServiceImpl = new StudentMaintenanceServiceImpl(new StudentRepositoryHibernate());
        studentMaintenanceServiceImpl.addNewStudent("Kim Gayeon", new Date());
	}

}
