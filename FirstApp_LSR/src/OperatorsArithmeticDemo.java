
public class OperatorsArithmeticDemo {

	public static void main(String[] args) {
		int a =24;
		int b =34;

		int r = a + b;
		
		System.out.println("a is : "+a);
		System.out.println("b is : "+a);
		System.out.println("sum result is : "+r);

		int s = a - b;
		System.out.println("sub result is : "+s);


		double p = 5;
		int q = 2;
	
		// NOTE: int/int = int. int/double = double. double/int = double. double/double = double.
		//int d = p/q;
		System.out.println(" p/q is "+(p/q)); // the divison '/' gives quotient 
		System.out.println(" p%q is "+(p%q)); // the modulo division '%' gives remainder
	}
}
