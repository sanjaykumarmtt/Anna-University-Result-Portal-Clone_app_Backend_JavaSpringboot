package com.student.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.student.demo.exception.StudentIdNotFound;

@ControllerAdvice
public class GobalExceptionHandler {
	
	@ExceptionHandler(StudentIdNotFound.class)
	public ResponseEntity<String> studentnotfound(StudentIdNotFound stf){
		return new ResponseEntity<>(stf.getMessage(),HttpStatus.OK);
	}	
}
