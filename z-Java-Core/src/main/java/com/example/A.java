package com.example;


public  class A {
	
	 private String name;
	
	public Shape makeNoise() {
		System.out.println("in superclass A makeNoise method");
		return new Shape();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
