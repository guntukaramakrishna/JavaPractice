package com.prodep.tutorials.java.arrays;

import java.util.Scanner;

public class TwoDWithLoops {

	public static void main(String[] args) {

		String streets[][] = new String[2][2];
		// Ctrl + Shift + o
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Array Length: "+streets.length);

		for(int i=0;i<streets.length;i++){

			System.out.println("Each internal array length : "+streets[i].length);
		}

		for(int i=0;i<streets.length;i++){

			for(int j=0;j<streets[i].length;j++){
				System.out.println("Enter the street name ");
				streets[i][j] = sc.nextLine();
				
			}
		}

		//Math.sqrt(4);
		
		System.out.println("Street Names are here !!");
		for(int i=0;i<streets.length;i++){

			for(int j=0;j<streets[i].length;j++){
				System.out.println(streets[i][j]);
			}
		}

		sc.close();

	}
}
