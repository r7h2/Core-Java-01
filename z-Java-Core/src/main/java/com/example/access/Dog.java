package com.example.access;


public class Dog extends Animal {
	// Dog IS-A Dog
	// Dog IS-A Animal
	// Dog IS-A Object
	
	
	// encapsulation (hiding)
	// access modifiers: private, public, default, protected (package + kids)
	// default or "package"(folder) access
	// accessible anywhere - even outside the package that Dog.java is in. 
//	private String name; // instance variables
//	private int age;
//	private String furColor;
	//protected int x; // package level. AND subclasses (even in diff package) can access 
	
	
	
     public Dog() {}
	
	public Dog(String name) {
		super();
		setName(name);
	}



	// overloading the constructor
	
	

	//instance method
	 public void jump() {
		
	}
	 
	// overriding the makeNoise method
	 public void makeNoise() {
		 System.out.println("woof woof");
	 }
	 
	 public static void doThis() {
			System.out.println("do in Dog");
		}
	
	
	

}
