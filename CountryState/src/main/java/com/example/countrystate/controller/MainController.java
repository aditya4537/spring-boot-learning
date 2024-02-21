package com.example.countrystate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.countrystate.entity.Country;
import com.example.countrystate.entity.State;
import com.example.countrystate.service.CountryService;

@RestController
public class MainController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/getAll")
	public List<Country> getData(){
		return countryService.displayAll();
	}
	
	@PostMapping("/addCountry")
	public Country saveCountry(@RequestBody Country country) {
		return countryService.addCountry(country);
	}

	@PostMapping("/addState")
	public State saveState(@RequestBody State state) {
		return countryService.addState(state);
	}
	
	@PutMapping("/assignStates")
	public Country addStateToCountry(@RequestParam("cId") int cId, @RequestParam("sId") int... sIds) {
		return countryService.addStateToCountry(cId, sIds);
	}
	
	@GetMapping("/stateByCountry")
		public List<String> stateByCountry(@RequestParam("cName") String countryname){
		return countryService.getStatesByCountry(countryname);
	}

	@GetMapping("/countryByState")
	public List<Object> countryByState(@RequestParam("sName") String statename){
		return countryService.getCountryByState(statename);
	}
	
}
