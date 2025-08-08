package com.aj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping 
	public String HomeControllerHandler () {
		return "This is Home Controller";
	}
	
	// TO CHANGE END-POINT
	@GetMapping ("/home")
	public String HomeControllerHandler2 () {
		return "This is Home Controller 2";
	}
}
