package com.ddd.interfaces.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfessorController {
	@RequestMapping("/")
	public String index(Model model){
		return "index";
	}
}
