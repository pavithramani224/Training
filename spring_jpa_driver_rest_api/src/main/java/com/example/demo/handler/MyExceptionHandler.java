package com.example.demo.handler;

import java.time.LocalDateTime;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j

public class MyExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	
	public ErrorMesssage handlesAll(Exception ex,WebRequest req) {
		log.error(ex.getMessage());
		
		
		return new ErrorMesssage(ex.getMessage(),LocalDateTime.now(),req.getDescription(false));
		
	}

}
