package com.example;

public class B extends A {
	
	// uses a covariant return - Square IS-A Shape
	public Square makeNoise() {
		super.makeNoise();
		System.out.println("in subclass B makeNoise method");
		System.out.println(getName());
		return new Square();
	}

}
