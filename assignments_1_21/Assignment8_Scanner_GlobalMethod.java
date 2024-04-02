//Execute the Scanner class with all the methods using Global Variables 
package assignments_grotech;

import java.util.*;

public class Assignment8_Scanner_GlobalMethod {
	
	Scanner s= new Scanner(System.in);
	//System.out.println("Input first number"); //can't print anything outside a method but inside a class like this for that use static block
	int a=s.nextInt();
	int b=s.nextInt();
	static
	{
		
		System.out.println("Input both number"); //can't print anything outside a method but iniside a class like this for that use static class
	}
	
	public void add()
	{
		
		int c=a+b;
		System.out.println("Addition of " +a +" & " +b +" = " +c );
	}
	
	public void sub()
	{
		
		int c=a-b;
		System.out.println("Subtraction of " +a +" & " +b +" = " +c);
	}
	public void mul()
	{
		
		int c=a*b;
		System.out.println("Multiplication of " +a +" & " +b +" = " +c);
	}
	public void div()
	{
		
		int c=a/b;
		System.out.println("Division of " +a +" & " +b +" = " +c);
	}
	public void Rem()
	{
		
		int c=a%b;
		System.out.println("Reminder of " +a +" & " +b +" = " +c);
	}
	
	
	

	public static void main(String[] args) {
	
		Assignment8_Scanner_GlobalMethod a1=new Assignment8_Scanner_GlobalMethod();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.Rem();

	}

}
