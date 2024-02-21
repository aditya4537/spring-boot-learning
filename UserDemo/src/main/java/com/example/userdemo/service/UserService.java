package com.example.userdemo.service;

import java.util.List;

import com.example.userdemo.model.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUser(int id);
	
	public User saveUser(User user);
}
