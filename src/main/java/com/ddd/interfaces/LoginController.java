package com.ddd.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddd.domain.model.professor.ProfessorRepository;
import com.ddd.domain.model.student.StudentRepository;

@Controller
public class LoginController {
	
	private StudentRepository studentRepository;
	private ProfessorRepository professorRepository;
	
	@RequestMapping("/")
	public String index(Model model){
		return "login";
	}
	
//	@RequestMapping("/login")
//	public String login(Model model) {
//		
//	}
}
