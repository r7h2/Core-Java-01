package com.example;

public class ABTest {

	public static void main(String[] args) {
		A a1 = new B();
		//a1.setName("Franny");
		a1.makeNoise();
		
		boolean result = a1 instanceof A;
		System.out.println(result);

	}

}
