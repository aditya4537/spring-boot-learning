package com.example.cars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cars.model.CarsData;
import com.example.cars.repository.CarsRepository;

@Service
public class CarsImpl implements Cars{
	
	@Autowired
	private CarsRepository cr;

	@Override
	public List<CarsData> printDetails() {
		
		return cr.findAll();
	}
	
}
