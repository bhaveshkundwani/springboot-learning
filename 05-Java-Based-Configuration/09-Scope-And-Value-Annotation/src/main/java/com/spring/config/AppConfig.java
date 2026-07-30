package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring")
public class AppConfig {
	
//	@Bean
//	public Laptop laptop() {
//		return new Laptop();
//	}
//
//	@Bean
//	@Primary
//	public Desktop desktop() {
//		return new Desktop();
//	}
//	
//	@Bean
//	public Alien alien(Computer com) {  // @Qualifier("desktop")
//		
//		Alien obj = new Alien();
//		obj.setAge(22);
//		obj.setCom(com);
//		
//		return obj;
//	}
	
}
