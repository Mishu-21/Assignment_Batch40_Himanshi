//Create 5 non static methods (Addition,Subtraction, Multiplication, Division & Modulus ) - get the User input in the Main Method using Scanner class 

package Class_Topics_Assignment;

import java.util.Scanner;

public class Assignment70_5NonStaticMethod_UserInputUsingScannerInMainMethod  {

	public static void add(int a,int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	

	public static void sub(int a,int b)
	{
		System.out.println("subtraction: "+(a-b));
	}
	

	public static void mul(int a,int b)
	{
		System.out.println("Multiplication: "+(a*b));
	}
	

	public static void Division(int a,int b)
	{
		System.out.println("Division: "+(a/b));
	}
	

	public static void Remainder(int a,int b)
	{
		System.out.println("Remainder: "+(a%b));
	}
	

	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value");
		int first =s.nextInt();
		System.out.println("Enter second  value");
		int second =s.nextInt();
		add(first, second);
	 sub(first, second);
	 Division(first, second);
	 Remainder(first, second);
mul(first, second);
	}
}
