package com.exmaple.microservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	
	
	@RequestMapping("/test")
	public String test()
	{
		return "Hello";
	}

	
	
}
