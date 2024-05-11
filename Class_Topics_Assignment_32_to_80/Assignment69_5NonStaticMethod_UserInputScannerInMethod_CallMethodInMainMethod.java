//Create 5 non static methods (Addition,Subtraction, Multiplication, Division & Modulus ) for each arithmetic operation and get the User input using Scanner class and call them inside the Main Method

package Class_Topics_Assignment;
import java.util.Scanner;
public class Assignment69_5NonStaticMethod_UserInputScannerInMethod_CallMethodInMainMethod {

	public static void Add()
	{
		System.out.println("Addition Method");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value");
		int first =s.nextInt();
		System.out.println("Enter second  value");
		int second =s.nextInt();
	 System.out.println("Addition: "+ (first+second));
	}
	
	public static void Sub()
	{
		System.out.println("Subtraction Method");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value");
		int first =s.nextInt();
		System.out.println("Enter second  value");
		int second =s.nextInt();
	 System.out.println("Subtraction: "+ (first-second));
	}
	
	public static  void Mul()
	{
		System.out.println("Multiplication Method");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value");
		int first =s.nextInt();
		System.out.println("Enter second  value");
		int second =s.nextInt();
	 System.out.println("Multiplication: "+ (first*second));
	}
	
	public static void Div()
	{
		System.out.println("Division Method");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value");
		int first =s.nextInt();
		System.out.println("Enter second  value");
		int second =s.nextInt();
	 System.out.println("Division: "+ (first/second));
	}
	
	public static  void Modulus()
	{
		System.out.println("Modulus Method");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value");
		int first =s.nextInt();
		System.out.println("Enter second  value");
		int second =s.nextInt();
	 System.out.println("Modulus: "+ (first%second));
	}
	
	public static void main(String[] args) {
		Add();
		Sub();
		Div();
		Modulus();
		Mul();
	}
}
