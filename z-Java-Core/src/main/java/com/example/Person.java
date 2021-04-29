package com.example;

public class Person { // class is called type
	// variables, properties, attributes, fields
	// data
	
	private int age = 30; // instance variable -  default value of int = 0
	private String name;  // instance variable - default value of ref variable == null
	private double heightInInches; 	// instance variable
	private double salary;
	
	static int count =50; // static == blueprint default value of 0
	
	public Person() {
		
	}
	
	public Person(int ageInput) {
		age = ageInput;
	}
	
	
	public void makeNoise(String message) {
		System.out.println("my message is this: " + message);
	}
	
	
	public static String staticPracticeMethod() {
		
		return "testing";
	}
	
	// instance method and it is an overloaded version of makeNoise(String)
	public void makeNoise() {
		
		Person.count++;
		
		System.out.println("static count is now: " + Person.count);
		
		String s1; // local variable
		
		int x = 5; // local variable - it was declared inside a method
		int y = 0; // local variables do NOT have a default value
		
		
		
		//System.out.println(  y   );
		
		blah();
		
		
		System.out.println("name: " + name + " age: " + age + " height:"  + heightInInches );
		y = 5;
		System.out.println(y);
	} // x is deleted - evaporates
	
	//instance method
	public void blah() {
		
		
	}

	//instance methods
	public int getAge() {
		return age;
	}

	//instance method - has to be running a particular instance. P1? P2?
	public void setAge(int age) {
		this.age = age; // "this" is a reference variable that holds an address to the instance you are currently accessing. 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeightInInches() {
		return heightInInches;
	}

	public void setHeightInInches(double heightInInches) {
		this.heightInInches = heightInInches;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
	
	

}
