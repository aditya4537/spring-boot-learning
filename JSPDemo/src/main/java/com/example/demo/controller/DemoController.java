package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@GetMapping("/main")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
