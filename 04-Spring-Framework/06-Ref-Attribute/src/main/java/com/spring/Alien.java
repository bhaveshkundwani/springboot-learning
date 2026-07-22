package com.spring;

public class Alien {
	
	private int age;
	
	private Laptop lap;

	public Alien() {
		System.out.println("Object Created");
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
