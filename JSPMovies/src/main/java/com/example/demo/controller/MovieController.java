package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieController {

	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView m = new ModelAndView();
		return m;
	}
}
