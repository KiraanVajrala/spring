package com.bellinfo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.spring.model.Student;
import com.bellinfo.spring.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping(value="/student",method= RequestMethod.GET)
	public String indexPage(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-login";
	}
	
	@RequestMapping(value="/student",method= RequestMethod.POST)
	public String postStudentData(Model model,@ModelAttribute Student student) {
		service.processStudentData(student);
		String text = "Hey" +student.getName()+" \n Welcome to spring mvc";
		model.addAttribute("message", text);
		return "success";
		
	}

}


