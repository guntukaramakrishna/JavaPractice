package com.prodep.tutorials.java.branching;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int x = sc.nextInt();
		if(x> 0){
			if(x%2 == 0){
				System.out.println("Given number is even number");
			}
			else{
				System.out.println("Given number is odd number");
			}
		}
		else 
			System.out.println("Given number is negative"); // ALT + Down Arrow
		 

		
		if(x > 0 && x%2 == 0){
			System.out.println("Given number is even number");
		}
		else{
			if(x<0){
				System.out.println("ALERT !! Negative numbers cannot be determined as even or odd");
				return;
			}
			System.out.println("Given number is odd number");
		}
		System.out.println("I am done bye bye");
		sc.close();
	}
	
}
