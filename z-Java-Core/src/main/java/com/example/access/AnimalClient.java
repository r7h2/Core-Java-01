package com.example.access;

public class AnimalClient {

	public static void main(String[] args) {
		
		// a1 can hold an address to any object that IS-A Cat
		
		// polymorphism (many forms - treating many forms as ONE thing/form)
		//Animal a1 = new Dog();
	    //a1.makeNoise();
		
		
	    
	    Object c1 = new Cat();
	    Cat c4 = (Cat) c1;
	    c4.sleepingLikeACat();
	    
	    Animal c2 = new Cat();
	    
	    Chicken c3 = new Chicken();
	    
	    
	    boolean result = c1 instanceof Animal;
	    System.out.println("result: " + result);
	    
	    //tryThis(c1);
		

	}
	
	// polymorphic method
	public static void tryThis (Animal a2) {
		
		a2.makeNoise();
	
		
		
	}
	
	
	
}
