package com.ddd.interfaces;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ddd.application.impl.LoginServiceImpl;
import com.ddd.domain.model.professor.Professor;
import com.ddd.domain.model.student.Student;
import com.ddd.infrastructure.persistence.hibernate.ProfessorRepositoryHibernate;
import com.ddd.infrastructure.persistence.hibernate.StudentRepositoryHibernate;

@Controller
@SessionAttributes("id")
public class IndexController {

	@RequestMapping("/")
	public String index(){
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("type") String type, @RequestParam("id") String id, Model model) {
		LoginServiceImpl loginService = new LoginServiceImpl(new StudentRepositoryHibernate(), new ProfessorRepositoryHibernate());
		if(type.equals("registrar")){
			return "redirect:/registrar";
		} else if(type.equals("student")) {
			Student student = loginService.loginStudent(id);
			model.addAttribute("id", id);
			model.addAttribute("type", type);
			model.addAttribute("name", student.name());
			return "redirect:/student/schedule";
		} else {
			Professor professor = loginService.loginProfessor(id);
			return "redirect:/professor";
		}
	}
}
