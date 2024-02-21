package com.example.cars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.cars.service.Cars;

@Controller
public class CarController {

	@Autowired
	private Cars c;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("cars", c.printDetails());
		return mv;
	}
}
