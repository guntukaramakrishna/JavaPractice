package com.prodep.tutorials.java.arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6};
		int b[] = new int[8];
		b[0] = 7; b[1] = 8; b[2] = 9;
		System.arraycopy(a, 0, b, 3, 5);
		
		for(int element:b){
			System.out.println(element);
		}
		
		
	}
}
