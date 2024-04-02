//Find the Area of the Circle having 'pi' as static, final and Global with int radius and double radius using Scanner class
package assignments_grotech;

import java.util.Scanner;

public class Assignment9_Scanner_AreaOfCircle {
 
	final static double pi=3.14;
	
	public static void AreaOfCircle_IntRadius()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter int radius value");
		int radius=s.nextInt();
	  System.out.println("Area of Circle with int radius value =" +(pi*radius*radius));
    //  s.close(); //If we r closing in each method then we r not able to enter value in next method giving us exception error as NoSuchElementException
	//so to avoid this always close it in the last method
	}
	public static void AreaOfCircle_DoubleRadius()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter double radius value");
		Double radius=s.nextDouble();
	  System.out.println("Area of Circle with double radius value =" +(pi*radius*radius));
      s.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle_IntRadius();
		AreaOfCircle_DoubleRadius();
	}

}
