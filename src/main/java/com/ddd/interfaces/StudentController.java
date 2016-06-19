package com.ddd.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ddd.domain.model.student.Student;
import com.ddd.domain.model.student.StudentId;
import com.ddd.infrastructure.persistence.hibernate.StudentRepositoryHibernate;

@Controller
@SessionAttributes("id")
public class StudentController {
	
	@RequestMapping("/student/schedule")
	public String index(Model model, @RequestParam("id") String id){
		StudentRepositoryHibernate studentRepositoryHibernate = new StudentRepositoryHibernate();
		Student s = studentRepositoryHibernate.find(new StudentId(id));
		model.addAttribute("list", s.schedule());
		System.out.println(id);
		return "studentIndex";
	}
}
