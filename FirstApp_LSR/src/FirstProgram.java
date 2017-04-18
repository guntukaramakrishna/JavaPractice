import java.util.Scanner;


public class FirstProgram {

	public static void main(String[] args) {
		System.out.print("Hello world !!");
		System.out.println("Hello world !!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first value ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second value ");
		int b = sc.nextInt();
		
		int result = a+b;
		
		int age = 45;
		
		System.out.println(age);
		//System.out.println("address of a is"+&a);
		//int b = 32;
		
		System.out.println("Result is "+result);
		//System.out.println(result);
		
		System.out.println("Enter the name:");
		sc.skip("\r\n");
		String name = sc.nextLine();
		System.out.println(name);
	}
	
}
