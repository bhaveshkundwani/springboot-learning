package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;

public class App {
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Desktop desktop1 = context.getBean(Desktop.class);
    	desktop1.compile();
    	
    	Desktop desktop2 = context.getBean(Desktop.class);
    	desktop2.compile();
    }
}
