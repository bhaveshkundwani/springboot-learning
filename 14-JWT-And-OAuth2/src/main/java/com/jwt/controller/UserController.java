package com.jwt.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;
import com.jwt.service.JwtService;
import com.jwt.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;

	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		
		if (authentication.isAuthenticated()) {
			return jwtService.generateToken(user.getUsername());
		}
		
		return "Faliure";
	}
}
