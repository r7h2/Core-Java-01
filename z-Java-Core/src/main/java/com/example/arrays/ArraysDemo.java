package com.example.arrays;

import java.io.IOException;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// quiz (predict the output) (slide 39)
		//int [] a = new int[5] {1,2,3};
		
		int[] a1 = new int[] {1,2,3};
		for (int element: a1) {System.out.println("i = " + element);}
		
		int [][] x = new int[3][]; // initialize number of rows
		x[0] = new int[3];
		x[1] = new int[2];
		x[2] = new int [5];
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("in outer for loop");
			for(int j = 0; j < x[i].length; j++) {
				x[i][j] = i;
				System.out.println(x[i][j]);
			}
			
		}
		
		

	}

}
