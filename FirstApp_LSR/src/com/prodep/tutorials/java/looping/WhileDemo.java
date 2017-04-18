package com.prodep.tutorials.java.looping;

public class WhileDemo {

	public static void main(String[] args) {

		int i = 0;
		while(i<5){
			if(i%2==0){
				System.out.println(i+" is a even number");
			}
			else
			{
				System.out.println(i+" is a odd number");
			}
			i++;	
		}
	}

}
