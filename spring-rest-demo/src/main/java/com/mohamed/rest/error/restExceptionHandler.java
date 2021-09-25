package com.mohamed.rest.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class restExceptionHandler {
	

	// exception handler 
	@ExceptionHandler
	public ResponseEntity<ResponseError> handel (RuntimeException exe)
	{
		ResponseError error = new ResponseError();
		
		error.setMessage(exe.getLocalizedMessage());
		error.setStaus(HttpStatus.NOT_FOUND.value());
		error.setTime(System.currentTimeMillis());
		
		return new ResponseEntity(error , HttpStatus.NOT_FOUND);
	}
	
	

}
