package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcHandler {

	public ExcHandler() {
	}

	
	@ExceptionHandler
	public ResponseEntity<ResponseError> handel (RuntimeException exe)
	{
		
		ResponseError error = 
				new ResponseError(HttpStatus.NOT_FOUND.value() ,
						"This id not found " ,
						System.currentTimeMillis());
	
		return new ResponseEntity(error , HttpStatus.NOT_FOUND) ;
		
	}
	
}
