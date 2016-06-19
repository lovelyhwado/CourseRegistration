package com.ddd.interfaces;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddd.domain.model.professor.ProfessorRepository;
import com.ddd.domain.model.student.Student;
import com.ddd.domain.model.student.StudentId;
import com.ddd.domain.model.student.StudentRepository;

@Controller
public class IndexController {
	
	private StudentRepository studentRepository;
	private ProfessorRepository professorRepository;
	
	@RequestMapping("/")
	public String index(){
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("type") String type, @RequestParam("id") String id, Model model) {
		if(type.equals("registrar")){
			return "redirect:/registrar";
		} else if(type.equals("student")) {
			Student student = studentRepository.find(new StudentId(id));
			model.addAttribute("id", id);
			model.addAttribute("name", student.name().toString());
			return "redirect:/student";
		} else {
			return "redirect:/professor";
		}
	}
}
