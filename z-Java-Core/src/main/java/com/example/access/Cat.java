package com.example.access;

public class Cat extends Animal { 
	// Cat IS-A Cat
	// Cat IS-A Animal
	// Cat IS-A Object
	
	
	 
	 public void sleepingLikeACat() {}
	 
	 // overriding the makeNoise method
	 public void makeNoise() {
		 //super.makeNoise();
		 System.out.println("meow meow");
	 }
	 

}
