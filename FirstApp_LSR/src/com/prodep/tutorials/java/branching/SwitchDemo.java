package com.prodep.tutorials.java.branching;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char ch = 'a';
		
		final char var1 = 't';
		switch(ch){
		
			default :
				System.out.println(ch+" is a consonant");
				break;
				
			case 'a':
			case 'i':
			case 'o':
				System.out.println(ch+" is a vowel");
				break;
			
			case 'u':
				System.out.println(ch+" is a vowel");
				break;
				
		}
		
		System.out.println("This is a statement out of the switch block");
		
		byte b = 32;
		switch(b) {
		
		}
		
		int a = 33;
		switch(a) {
		
		}
		/*long l = 21L;
		switch(l){
		
		}*/
		/*if(ch == 'w') {
			
		}*/
				
	}
}
