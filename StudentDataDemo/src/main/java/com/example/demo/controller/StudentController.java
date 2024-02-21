package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.StudentData;

@Controller
@RequestMapping("/home")
@ResponseBody
public class StudentController {
	
	@Autowired
	StudentData s1;
	
	@GetMapping("/data")
	public String home() {
		s1.singleInfo();
		return "Successfully Printed the data";
	}
	@GetMapping("/all")
	public String all() {
		s1.allInfo();
		return "Successfully Printed all the data.";
	}
	
}
