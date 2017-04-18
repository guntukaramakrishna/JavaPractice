package com.prodep.tutorials.java.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int []a = new int[5];
		
		a[0] = 23;
		a[1] = (int)43.5;
		a[2] = 53;
		a[3] = 32;
		a[4] = 95;
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);*/
		
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
		//System.out.println(a[1]);
		
		int sal[] = {23,32,43,45,53};
		
		for(int i=0;i<sal.length;i++){
			//sal[i] = sal[i]+10;
			sal[i] += 10;
		}
		
		
		String str = "hihowareyo";
		str.length();
		
		
		
	}
}
