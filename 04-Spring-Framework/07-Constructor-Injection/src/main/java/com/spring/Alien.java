package com.spring;

import java.beans.ConstructorProperties;

public class Alien {
	
	private int age;
	
	private Laptop lap;

	public Alien() {
		System.out.println("Object Created");
	}
	
	@ConstructorProperties({"age", "lap"})
	public Alien(int age, Laptop lap) {
		System.out.println("Para Constructor Called");
		this.age = age;
		this.lap = lap;
	}

	public void code() {
		System.out.println("Coding");
		lap.compile();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter Called");
		this.age = age;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	
}
