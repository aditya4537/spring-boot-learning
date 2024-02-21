package com.example.userdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userdemo.Exception.UserNotFoundException;
import com.example.userdemo.model.User;
import com.example.userdemo.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;


	@Override
	public User getUser(int id) {
		User exc = userRepo.findById(id).orElseThrow(()->new UserNotFoundException("User not found"));
		return exc;
	}
	
	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();		
	}

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}


}
