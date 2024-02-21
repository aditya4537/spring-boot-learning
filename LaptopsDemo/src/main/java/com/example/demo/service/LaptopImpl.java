package com.example.demo.service;

import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.example.demo.model.LaptopData;

@Service
public class LaptopImpl implements Laptop{

	LinkedList<LaptopData> ll = new LinkedList<>();
	@Override
	public void data() {
		// TODO Auto-generated method stub
		
		LaptopData l = new LaptopData();
		l.setName("Latitude E6520");
		l.setCompany("Dell");
		l.setModelYear(2020);
			
		LaptopData l1 = new LaptopData();
		l1.setName("Pavilion");
		l1.setCompany("HP");
		l1.setModelYear(2021);
		
		ll.add(l);
		ll.add(l1);
		
		System.out.println(l);
		
	}
	
}
