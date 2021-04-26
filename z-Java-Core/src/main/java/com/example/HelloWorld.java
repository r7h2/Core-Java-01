package com.example;

public class HelloWorld {

	String name; // instance variable
	
	public static void main(String[] args) {
		
		
		// person walks out door
		// person gets in car
		// person starts car
		// person drives to store
		// person gets bread
		// person drives home
		// person puts bread in drawer
		

		
		
		
		
		
		boolean result; // local variable
		//System.out.println(result);
		
		
		result = 8 > 11;
		
		if ( result ) {
			System.out.println( "result: " + result  );	
			
		
	   } else if (true) {
		  //System.out.println("end");
	   }
	   else {
		   
	   }
		
		int num = 5; // local variable
		
		switch(num) {
		
			case 4: System.out.println("4"); 
			case 5: System.out.println("5"); 
			case 6: System.out.println("6");	
			default: System.out.println("default value");
		
		}
		
		System.out.println("end of switch");
		
		//looping
		
		int count = 0;
		int tracking = 0;
		
		while(count > 10) {
			
			System.out.println("count: " + count);
		count++;
			
		}
		
		do {
			count++;
		} while(count < 5);
		
		for(int i = 0; i <= 10 ; i++  ) {
			
			System.out.println("i = " + i);
		}
		
		
		int[] intArray = new int[10];
		intArray[0] = 7;
		intArray[7] = 3;
		
		int[] secondIntArray = {9,18,25,2, 8};
		
		// for-each 
		for( int e : secondIntArray) {
			
			System.out.println("e=" + e);
			
		}
		
		
		
		
		
		
	}
	
	

}
