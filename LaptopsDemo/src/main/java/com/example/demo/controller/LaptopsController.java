package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.Laptop;

@Controller
@RequestMapping("/home")
@ResponseBody
public class LaptopsController {
	
	@Autowired
	Laptop l;
	
	@GetMapping("/laptopDetails")
	public String laptop() {
		l.data();
		return "<h1>Here are the laptop details</h1>";
	}
}
