package com.example.countrystate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.countrystate.entity.Country;
import com.example.countrystate.entity.State;
import com.example.countrystate.repository.CountryRepo;
import com.example.countrystate.repository.StateRepo;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private StateRepo stateRepo;
	
	@Override
	public List<Country> displayAll(){
		return countryRepo.findAll();
	}

	@Override
	public Country addCountry(Country country) {
		return countryRepo.save(country);
	}

	@Override
	public Country addStateToCountry(int cId, int... sIds) {
		
		Country country = countryRepo.findById(cId).get();
		List<State> states = new ArrayList<>();
		
		for(int i: sIds) {
			states.add(stateRepo.findById(i).get());
		}
		
		country.setCountryState(states);
		return countryRepo.save(country);
	}

	@Override
	public State addState(State state) {
		return stateRepo.save(state);
	}
	
	public List<String> getStatesByCountry(String countryname){
		List<State> countryState = countryRepo.getByCountryName(countryname).getCountryState();
		List<String> states = new ArrayList<>();
		countryState.forEach(x -> states.add(x.getStateName()));
		return states;
	}

	@Override
	public List<Object> getCountryByState(String statename) {
		return stateRepo.countryByState(statename);
	}

}
