package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class InfoController {
	
	@GetMapping(path="/info")
	
	public String getUser() {
		return "un secured endpoint";
	}

	
}
