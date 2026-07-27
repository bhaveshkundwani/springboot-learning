package com.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.Alien;
import com.spring.Computer;
import com.spring.Desktop;

@Configuration
public class AppConfig {

	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
	
	@Bean
	public Alien alien(@Autowired Computer com) {
		
		Alien obj = new Alien();
		obj.setAge(22);
		obj.setCom(com);
		
		return obj;
	}
	
}
