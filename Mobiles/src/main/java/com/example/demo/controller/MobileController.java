package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.MobileData;
import com.example.demo.service.Mobile;


@Controller
public class MobileController {
	
	@Autowired
	private Mobile m;
	
	@GetMapping("/mobile")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("mobile", m.details());
		System.out.println(m.details());
		return mv;
	}
	
	@GetMapping("/add")
	public ModelAndView addMobile() {
		ModelAndView mv = new ModelAndView("add");
		return mv;
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("imei") int imei) {
		System.out.println("Hello world");
		System.err.println("mobile method API Calling...");
		m.delete(imei);
		return new ModelAndView("redirect:/mobile");
	}
	
//	@GetMapping("/get")
//	public ResponseEntity<MobileData> get(@RequestParam("imei") int imei) {
//		System.err.println("mobile method API Calling...");
//		return ResponseEntity.ok(m.get(imei));
//	}
	
	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam("imei") Integer imei)
	{
		ModelAndView edit = new ModelAndView("edit");
		edit.addObject("mob", m.edit(imei));
		return edit;
	}

	
	@PostMapping("/addMobile")
	public ModelAndView addMobile(@ModelAttribute("mobile") MobileData mobile, BindingResult result) {
		m.save(mobile);
		return new ModelAndView("redirect:/mobile");
	}
}

