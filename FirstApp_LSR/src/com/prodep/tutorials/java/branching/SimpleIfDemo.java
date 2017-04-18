package com.prodep.tutorials.java.branching;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a >= 0)
			System.out.println("Given number is positive");
		
		if(a < 0){
			System.out.println("Given number is negative");
		}
		// Find out which number is even or odd.
		sc.close();
	}
}
