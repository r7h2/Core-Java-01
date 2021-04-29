package com.example.access;

public class AnimalClient {

	public static void main(String[] args) {
		
		System.out.println("args length: " + args.length);
		System.out.println("args[0]: " + args[0]);
		System.out.println("args[1]: " + args[1]);
		System.out.println("args[2]: " + args[2]);
		
		//int newInt = Integer.parseInt(args[0]); // coming in as "one"
		
		//System.out.println("args[3]: " + args[3]);
		
		// a1 can hold an address to any object that IS-A Cat
		
		// polymorphism (many forms - treating many forms as ONE thing/form)
		//Animal a1 = new Dog();
	    //a1.makeNoise();
		
		String s1 = null;
		boolean result = "HI".equalsIgnoreCase(s1);
		System.out.println(result);
		
		int[] x1 = {5,6};
		String[] z = {"blue", "green", "fun"};
		
		for( String i  : z ) {
			
			System.out.println( i  );
		}
		
		
		//System.out.println(     s1  );
	    
	    Animal c1 = new Cat();
	    c1 = null; // now this cat object is ELIGIBLE for garbage collection
	    
	    //c1.makeNoise();
	    
	    //c1.sleepingLikeACat();
	    
	    if (c1 instanceof Cat) {
	    	//Cat c4 = (Cat) c1; 
	    }
	    //c4.sleepingLikeACat();
	    
	    Animal c2 = new Cat();
	    
	    Chicken c3 = new Chicken();
	    
	    
	    //boolean result = c1 instanceof Animal;
	    //System.out.println("result: " + result);
	    
	    //tryThis(c1);
		

	}
	
	// polymorphic method
	public static void tryThis (Animal a2) {
		
		a2.makeNoise();
	
		
		
	}
	
	
	
}
