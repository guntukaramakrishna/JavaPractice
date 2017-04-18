package com.prodep.tutorials.java.looping;

public class BreakDemo {

	public static void main(String[] args) {
		
		executeThis();

		System.out.println("one more time");
			
		
	}
	
	private static void executeThis()
	{
		int i = 0;
		while(i < 5){
			System.out.println("i value is ="+i);
			i++;
			if(i==2){
				//System.exit(0);
				//break;
				//continue;
				//return;
			}
		}
		System.out.println("do you see me ? I am here to be executed !!");
	}
}
