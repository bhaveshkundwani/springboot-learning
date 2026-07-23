package com.spring;

import java.beans.ConstructorProperties;

public class Alien {
	
	private int age;
	
	private Computer com;

	public Alien() {
		System.out.println("Object Created");
	}

	public void code() {
		System.out.println("Coding");
		com.compile();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter Called");
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}
	
}
