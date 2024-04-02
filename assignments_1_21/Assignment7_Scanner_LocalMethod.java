 //Execute the Scanner Class with all the methods using local Variable

package assignments_grotech;
import java.util.Scanner;
public class Assignment7_Scanner_LocalMethod {
	
	public void add()
	{
		System.out.println("Add Method");
		Scanner s= new Scanner(System.in);
		System.out.println("Input first number");
		int a= s.nextInt();
		System.out.println("Input Second number");
		int b= s.nextInt();
		System.out.println("Addition of" +a +"&" +b +"=" +(a+b) );
		//s.close();
	}
	
	public void sub()
	{
		System.out.println("Sub Method");
		Scanner s= new Scanner(System.in);
		System.out.println("Input first number");
		int a= s.nextInt();
		System.out.println("Input Second number");
		int b= s.nextInt();
		System.out.println("Subtracting of" +a +"&" +b +"=" +(a-b) );
		//s.close();
	}
	
	public void mul()
	{
		System.out.println("Mul Method");
		Scanner s= new Scanner(System.in);
		System.out.println("Input first number");
		int a= s.nextInt();
		System.out.println("Input Second number");
		int b= s.nextInt();
		System.out.println(" Multiplication of" +a +"&" +b +"=" +(a*b) );
		//s.close();
	}
	
	 void div()
	{
		 System.out.println("Div Method");
			Scanner s= new Scanner(System.in);
			System.out.println("Input first number");
			int a= s.nextInt();
			System.out.println("Input Second number");
			int b= s.nextInt();
			System.out.println("Division of" +a +"&" +b +"=" +(a/b) );
			//s.close();
	}
	
	public void rem()
	{
		System.out.println("Rem Method");
		Scanner s= new Scanner(System.in);
		System.out.println("Input first number");
		int a= s.nextInt();
		System.out.println("Input Second number");
		int b= s.nextInt();
		System.out.println("Reminder of" +a +"&" +b +"=" +(a%b) );
		s.close(); //closed in the last method only which we r calling and we can ignore the wedding
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment7_Scanner_LocalMethod a1= new Assignment7_Scanner_LocalMethod();
		a1.add();
	    a1.sub();
		a1.mul();
		a1.div();
		a1.rem();
	}

}
