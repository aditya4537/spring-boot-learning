package com.example.userdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userdemo.model.User;
import com.example.userdemo.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/get")
	public List<User> getUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/get/{id}")
	public User getUsers(@PathVariable("id") int id){
		return userService.getUser(id);
	}
	
	@PostMapping("/add")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
}
