//Area of Circle with human input at the Run time for 10 times
package assignments_grotech;

import java.util.Scanner;

public class Assignment13_AreaOfCircle_10Times_Scanner {
	
	
	final static double pi=3.14;
	public static void main(String[] args) {
		
		for(int i=1;i<11;i++)
		{
			System.out.println(i +" times" );
			Scanner s=new Scanner(System.in);
			int radius =s.nextInt();
			System.out.println("Area of Circle" +(pi*radius*radius) );
			
		}
		
	}

}
