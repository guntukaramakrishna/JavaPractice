package com.prodep.tutorials.java.arrays;

public class TwoDExample {

	public static void main(String[] args) {
	
		int marks[][] = new int[2][2];
		
		marks[0][0] = 12;
		marks[0][1] = 17;
		
		marks[1][0] = 15;
		marks[1][1] = 18;
		
		System.out.println("1st student marks");
		System.out.println(marks[0][0]);
		System.out.println(marks[0][1]);
		System.out.println("2nd student marks");
		System.out.println(marks[1][0]);
		System.out.println(marks[1][1]);
		
	}
}
