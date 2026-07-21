package com.spring;

public class Alien {
	
	private int age;

	public Alien() {
		System.out.println("Object Created");
	}
	
	public void code() {
		System.out.println("Coding");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter Called");
		this.age = age;
	}
	
}
