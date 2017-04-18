package com.prodep.tutorials.java.arrays;

import java.util.Scanner;

public class EnhancedLoopArrays {

	public static void main(String[] args) {

		// 1. Need to declare an array.
		int arr[] = new int[5];

		// 2. Read the values into array.
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<5;i++) {
			System.out.println("Enter the "+(i+1)+" value");
			arr[i] = sc.nextInt();
		}
		
		// 3. Display the elements using for each 
		
		for(int var : arr){
			var+=10;
			System.out.println(var);
			System.out.println("Actual array value at index : 0 "+arr[0]);
		}
		
		/*for(int sss: a){
			System.out.println(sss);
		}*/
		
		int x = 12;
		
		x = 43;
		
		//arr = new double[4];
		
	}
}
