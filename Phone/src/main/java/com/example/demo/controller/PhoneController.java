package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.Phone;

@Controller
@RequestMapping("/main")
@ResponseBody
public class PhoneController {
	
	@Autowired
	Phone p;
	
	@GetMapping("/setPhones")
	public String settingPhones() {
		p.setPhones();
		return "Phone data set successfully.";
	}
	
	@GetMapping("/getPhones")
	public String gettingPhones() {
		p.getPhones();
		return "Phone data got successfully";
	}
}
