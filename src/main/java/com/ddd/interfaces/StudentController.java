package com.ddd.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/student")
	public String index(Model model){
		return "studentIndex";
	}
}
