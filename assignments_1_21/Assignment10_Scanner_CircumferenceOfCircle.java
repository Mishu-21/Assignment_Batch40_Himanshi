//Find the Circumference of the Circle having 'pi' as static, final and Global and r via Scanner class
package assignments_grotech;

import java.util.Scanner;

public class Assignment10_Scanner_CircumferenceOfCircle {

	final static double pi=3.14;
	
	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			System.out.println("Enter  radius ");
			int radius=s.nextInt();
		  System.out.println("Circumference of Circle =" +(2*pi*radius));
	    s.close();
	}

}
