//Switch case with the help of scanner class

package assignments_grotech;

import java.util.Scanner;

public class Assignment15_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number which method you want to perform ");
		System.out.println(" Method 1 Addition");
		System.out.println("Method 2 Subtraction");
		System.out.println("Method 3 divison");
		System.out.println("Method 4 multiplication");
		System.out.println("default: Remainder");
		
		Scanner s1= new Scanner(System.in);
		int choice=s1.nextInt();
		
		switch(choice)
		{
		case 1: 
		{
			System.out.println(" Perform Addition");
			Scanner s= new Scanner(System.in);
			System.out.println("Input first number");
			int a= s.nextInt();
			System.out.println("Input Second number");
			int b= s.nextInt();
			System.out.println("Addition of" +a +"&" +b +"=" +(a+b) );
			s.close();
			break;
		}
		case 2: 
		{
			System.out.println(" Perform Subtraction");
			System.out.println("Sub Method");
			Scanner s= new Scanner(System.in);
			System.out.println("Input first number");
			int a= s.nextInt();
			System.out.println("Input Second number");
			int b= s.nextInt();
			System.out.println("Subtracting of" +a +"&" +b +"=" +(a-b) );
			s.close();
			break;
		}	
		case 3: 
		{
			System.out.println(" Perform Division");
			Scanner s= new Scanner(System.in);
			System.out.println("Input first number");
			int a= s.nextInt();
			System.out.println("Input Second number");
			int b= s.nextInt();
			System.out.println("Division of" +a +"&" +b +"=" +(a/b) );
			s.close();
			
			break;
	}
			
			
		case 4: 
		{
			System.out.println(" Perform Multiplication");
			Scanner s= new Scanner(System.in);
			System.out.println("Input first number");
			int a= s.nextInt();
			System.out.println("Input Second number");
			int b= s.nextInt();
			System.out.println(" Multiplication of" +a +"&" +b +"=" +(a*b) );
			s.close();
			break;
		}	
	 default: 
	 {
			System.out.println(" Perform Reminder");
			Scanner s= new Scanner(System.in);
			System.out.println("Input first number");
			int a= s.nextInt();
			System.out.println("Input Second number");
			int b= s.nextInt();
			System.out.println("Reminder of" +a +"&" +b +"=" +(a%b) );
			s.close();
		}
		s1.close();	
			
		}
				
		
		

	}

}
