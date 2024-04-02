//Create 4 static method to perform arithmetic operations and call it inside the main method.

package assignments_grotech;

public class Assignment3_StaticMethod_ArithmeticOperation_CallInMainMethod {
	
	public static void add()
	{
		byte a=10, b=20;
		int c= a+b;
		System.out.println(c);
		
	}
	
	 static void mult()
	{
		 int a=10, b=20;
		int c= a*b;
			System.out.println(c);
		
	}
	
	static int sub()
	{
		short a=10, b=20;
		int c;
		c=a-b;
		System.out.println(c);
		return 0;
		
		
	}
	
	public static byte div()
	{
		byte a=20, b=10;
		int c= a/b;
		System.out.println(c);
		return 0;
		
		
	}
	
	

	public static void main(String[] args) {

		add();
		mult();
		sub();
		div();
	}

}
