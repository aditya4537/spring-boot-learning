package com.example.userdemo.Exception;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(String message){
		super(message);
	}
	
}
