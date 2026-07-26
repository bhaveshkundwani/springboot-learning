package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.Desktop;

@Configuration
public class AppConfig {

//	@Bean(name = {"com2", "Beast"})
	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
}
