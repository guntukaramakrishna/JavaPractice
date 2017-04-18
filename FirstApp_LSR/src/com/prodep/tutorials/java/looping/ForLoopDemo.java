package com.prodep.tutorials.java.looping;

public class ForLoopDemo {

	public static void main(String[] args) {

		for(int count =0 ; count<4 ;count++) {	

			for(int i=0;i<10;i++){
				if(i %2 == 0)
					System.out.print("# ");
				else
					System.out.print("@ ");
			}
			System.out.println();
			
		}
	}
}
