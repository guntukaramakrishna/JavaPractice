package com.prodep.tutorials.java.branching;

public class NestedIfDemo {

	public static void main(String[] args) {

		char ch = 'a';

		String msg = "";
		if(ch == 'a' || ch =='A') {
			msg = "It is vowel";
		}
		else if(ch == 'e') {
			msg = "It is vowel";		
		}
		else if(ch == 'i' || ch == 'o' || ch == 'u') {
			msg = "It is vowel";		
		} 
		else
		{
			msg = "It is consonant";
		}
		/*if(ch == 'v');
			System.out.println("hi");e
			System.out.println("hi-2");*/
		
		System.out.println(ch+" "+msg);
		// basic salary of a person
		// 10000 - 20000 . PF- 2, DA-4, HRA-5
		// 20000 - 30000   PF- 3, DA-3, HRA-5
		// 30000 - 50000   PF- 4, DA-2, HRA-5
		// above 50000   PF- 6, DA-2, HRA-5
		
		
	}
}
