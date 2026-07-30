package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Value("21")
	private int age;
	
	@Autowired
	//@Qualifier("desktop")
	private Computer com;

	public Alien() {
		System.out.println("Alien Object Created");
	}

	public void code() {
		System.out.println("Coding");
		com.compile();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
//		System.out.println("Setter Called");
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}
	
}
