package com.prodep.tutorials.java.methods;

public class MethodsDemo {

	public static void main(String[] args) {

		wishing();

		String abc = "John";
		wishPerson(abc);
		wishPerson("Raju"); // Ctrl + Cursor Click OR F3 on the method

		int p = add();
		System.out.println(p);

		double z = average(1, 2, 3);
		System.out.println(z);
		System.out.println(average(1, 2, 3));
		
		
		int a = 12, b = -2;
		String resultValue = checkCondition(a);
		if(resultValue.equals("Negative")){
			System.out.println("Negative number can not be operated !!");
		}
		//checkCondition(b);
		/*boolean value = checkConnection(); // DB connection
		if(value == true){
			// Go ahead and get the values from DB
		}
		else{
			return;
		}*/

	}

	private static String checkCondition(int a) {
		
		String result = "";
		if(a > 0){
			//return "Positive";
			result = "Positive";
		}
		else{
			//return "Negative";
			result = "Negative";
		}
		return result;
		
	}

	static void wishing() // defining a method.
	{
		System.out.println("-------------------------");
		System.out.println("*****JAVA WORLD *********");
		System.out.println("-------------------------");
		System.out.println("*****GREAT JOURNEY*******");
		System.out.println("-------------------------");
		System.out.println("\n\n");

	}

	static void wishPerson(String name) // name is a parameter.
	{
		System.out.println("hello Mr./ Ms "+name);
		System.out.println("how are you..");
	}

	static int add()
	{
		int a = 10, b =13;
		int c = a+b;
		return c;
	}

	static double average(int a, int b, int c)
	{
		int sum = a+b+c;

		double avg = sum/3.0;

		return avg;      
	}
	// RULE: From static context, you can access only the static members or static methods.
}
