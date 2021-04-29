package com.example;

public class PersonTest {
	
	static int z; 
	int blah; // instance var

	public static void main(String[] args) {
		
		int y = 0; // local variable
		
		
	Person p1 = null;

	
	 p1 = new Person(); // new is calling the default "no-args" constructor
	// p1.age = 20;
	 p1.setAge(40);
	 
	 p1.setName("Franny");
	 
	 p1.makeNoise();
	 
	 Person p2 = new Person();
	 //p2.age = 50;
	 p2.setName("Fred");
	 p2.setSalary(10000);
	 p2.makeNoise();
	 p2.setAge(20);
	 
	 Person p3 = new Person(20);
	 p3.makeNoise();
	 
	 System.out.println(   Person.count    );
	 String staticResult = Person.staticPracticeMethod();
	 System.out.println("static result: " + staticResult);
	 
	 Person p4 = new Person();
	 p4.makeNoise();
	 System.out.println( "person count =  " +  Person.count    );
	 
	 
	 System.out.println(     );
	 
	 
	 // from a static context, you can only access other static methods/variables
	 
	 
	 //System.out.println(     p1      ); // println method is overloaded 20+ times
	 // println(int x);
	 // println(Object o);
	 
	 
	 //p1.age = 5;

	} // end of the main method

}
