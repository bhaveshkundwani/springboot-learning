package com.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.spring.Alien;
import com.spring.Computer;
import com.spring.Desktop;
import com.spring.Laptop;

@Configuration
public class AppConfig {
	
	@Bean
	public Laptop laptop() {
		return new Laptop();
	}

	@Bean
	@Primary
	public Desktop desktop() {
		return new Desktop();
	}
	
	@Bean
	public Alien alien(Computer com) {  // @Qualifier("desktop")
		
		Alien obj = new Alien();
		obj.setAge(22);
		obj.setCom(com);
		
		return obj;
	}
	
}
