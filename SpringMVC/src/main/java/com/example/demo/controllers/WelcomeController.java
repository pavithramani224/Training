package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//class level
@RequestMapping("/mvc")
public class WelcomeController {
	
	//method level
	@RequestMapping(value = "/greet" ,method=RequestMethod.GET)
	@ResponseBody
	public String getMessage() {
		return "<h1 style='text-align:center'> welcome to spring mvc</h1>";
	}
	@RequestMapping(value = "/bye" ,method=RequestMethod.GET)
	@ResponseBody
	public String sendMessage() {
		return "<h1 style='color:blue'> Designed by pavi</h1>";
	}

}
