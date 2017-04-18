
public class OperatorsDemoIncrement {

	public static void main(String[] args) {

		int a=5,b=2;

		if(a != 0 && b != 0)
		{
		System.out.println("a : "+a);    //5
		System.out.println("b : "+b);    //2

		}
		
		b = a++;

		if(a > 0 || b > 0)
		{
		System.out.println("After post incrementation");

		System.out.println("a : "+a);    //6
		System.out.println("b : "+b);    //5

		}

		System.out.println("----------------------");


		int x=5,y=2;

		System.out.println("x : "+x);    //5
		System.out.println("y : "+y);    //2

		y = ++x;

		System.out.println("After pre incrementation");

		System.out.println("x : "+x);    //6
		System.out.println("y : "+y);    //6
		
		x = 5; y =2;
		
		y = x++ + y++;
		//char ch = 'a';
		
		System.out.println("x : "+x);    //6   6   6   6
		System.out.println("y : "+y);    //3   7   8   7
		
		
	}
}
