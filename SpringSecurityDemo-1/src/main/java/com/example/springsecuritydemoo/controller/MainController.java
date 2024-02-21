package com.example.springsecuritydemoo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping("/")
	@ResponseBody
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@GetMapping("/user/home")
	@ResponseBody
	public String uhome(Authentication authentication) {
		return "<h1>Hello: "+ authentication.getName() +"</h1>";
	}
	
	@GetMapping("/admin/home")
	@ResponseBody
	public String ahome(Authentication authentication) {
		return "<h1>Hellooo: "+ authentication.getName() +"</h1>";
	}
}
