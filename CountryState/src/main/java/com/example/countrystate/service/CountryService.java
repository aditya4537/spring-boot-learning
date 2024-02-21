package com.example.countrystate.service;

import java.util.List;

import com.example.countrystate.entity.Country;
import com.example.countrystate.entity.State;

public interface CountryService {

	public List<Country> displayAll();
	
	public Country addCountry(Country country);
	
	public State addState(State state);
	
	public Country addStateToCountry(int cId, int... sIds);
	
	public List<String> getStatesByCountry(String countryname);
	
	public List<Object> getCountryByState(String statename);
}
