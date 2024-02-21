package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.model.PhoneData;

@Service
public class PhoneImpl implements Phone{

	ArrayList<PhoneData> al = new ArrayList<>();
	@Override
	public void setPhones() {
		// TODO Auto-generated method stub
		al.clear();
		PhoneData p =new PhoneData();
		p.setName("Narzo 20");
		p.setCompany("Realme");
		p.setCameraMegaPixel(48);
		
		PhoneData p2 = new PhoneData();
		p2.setName("iPhone 15");
		p2.setCompany("Apple");
		p2.setCameraMegaPixel(60);
		
		al.add(p);
		al.add(p2);
	}

	@Override
	public void getPhones() {
		// TODO Auto-generated method stub
		PhoneData p =new PhoneData();
		System.out.println(al);
	}

}
