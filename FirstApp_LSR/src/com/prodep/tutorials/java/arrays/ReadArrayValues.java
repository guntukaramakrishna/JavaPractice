package com.prodep.tutorials.java.arrays;

import java.util.Scanner;

public class ReadArrayValues {

	public static void main(String[] args) {

		// 1. Need to declare an array.
		int a[] = new int[5];

		// 2. Read the values into array.
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<5;i++) {
			System.out.println("Enter the "+(i+1)+" value");
			a[i] = sc.nextInt();
		}

		// 3. Display the array elements.
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}

		System.out.println(a[10]); // ArrayIndexOutOfBoundsException
		sc.close();

	}
}
