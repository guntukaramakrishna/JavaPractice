package com.prodep.tutorials.java.arrays;

import java.util.Scanner;

public class MatrixExample {

	public static void main(String[] args) {
		
		int a[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		
		printArray(a);
		
		//printArray(a);
		
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		sc.close();
	}
	
	private static void printArray(int a[][])
	{
	for(int i=0;i<a.length;i++){
		
		for(int j=0;j<a[i].length;j++){
			System.out.print(a[i][j]+" ");
		}
		
		System.out.println();
	}
	}
}
