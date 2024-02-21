package com.example.userdemo.Advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.userdemo.Exception.UserNotFoundException;
import com.example.userdemo.dto.ResponseDto;

@RestControllerAdvice
public class CustomException { 
	
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseDto customException(UserNotFoundException ex){
		return new ResponseDto(404, "Error", ex.getMessage());
	}
}
