package com.example.access;

public class Animal extends Object { // abstract = "incomplete"
	
	// Animal IS-A Animal
	// Animal IS-A Object
	
	private String name; // instance variables
	private int age;
	private String furColor;
	
	public static final double SHOE_SIZE = 10; // global constant
	
	public  void makeNoise() {		
		System.out.println("generic noise");
	}
	
	public static void doThis() {
		System.out.println("do in Animal");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	

}
