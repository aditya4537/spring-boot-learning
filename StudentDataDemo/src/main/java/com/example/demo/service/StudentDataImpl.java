package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.model.Users;

@Service
public class StudentDataImpl implements StudentData{

	@Override
	public void allInfo() {
		Users user1 = new Users();
		user1.setId(8);
		user1.setName("Shivam");
		user1.setMarks(90);
		
		Users user2 = new Users();
		user2.setId(25);
		user2.setName("John");
		user2.setMarks(92);
		
		Users user3 = new Users();
		user3.setId(45);
		user3.setName("Sergio");
		user3.setMarks(85);
		
		ArrayList<Users> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		System.out.println(users);
	}

	@Override
	public void singleInfo() {
		Users user = new Users();
		user.setId(64);
		user.setName("Aditya");
		user.setMarks(95);
		
		System.err.println("Name:" + user.getName() + " Id:" + user.getId() + " Marks:" + user.getMarks());
	}
	
	
}
