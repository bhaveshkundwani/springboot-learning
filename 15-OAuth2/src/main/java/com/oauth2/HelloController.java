package com.oauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
    public String greet(){
		return "Welcome to OAuth2-Demo";
    }
	
}
