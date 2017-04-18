package com.prodep.tutorials.java.methods;

public class MethodsWithArray {

	public static void main(String[] args) {
		
		int p[] = {2,3,4,5};
		
		double avg = findAverage(p);
		System.out.println(avg);
		
		int evenNumbers[] = findEvenNumbers(p);
		
		for(int value: evenNumbers){
			System.out.println(value);
		}
		
	}
	private static int [] findEvenNumbers(int[] p) {

		int numbers[] = new int[p.length];
		
		int i = 0;
 		for(int value: p){
			if(value%2 == 0){
				numbers[i] = value;
			}
			i++;
		}
 		return numbers;
		
	}
	/**
	 * This method finds average of the given array
	 * @param a
	 * @return
	 */
	static double findAverage(int a[]){
		
		int sum = 0;
		for (int x : a) {
			sum += x;
		}
		double avg = sum/a.length;
		//System.out.println(avg);
		return avg;
	}
}
