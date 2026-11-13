package com.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String greet() {
		return "Hello!! ";
	}
	
	@GetMapping("/about")
	public String about() {
		return "Bhavesh!! ";
	}
	
}
