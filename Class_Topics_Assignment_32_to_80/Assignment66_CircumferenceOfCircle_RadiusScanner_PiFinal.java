//Find out the Circumference of the circle=2*pi*r;  'pi' as final variable and get the user i/p for 'r' using Scanner class

package Class_Topics_Assignment;

import java.util.Scanner;

public class Assignment66_CircumferenceOfCircle_RadiusScanner_PiFinal {
	final static double pi=3.14;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter int radius value");
		int radius=s.nextInt();
	  System.out.println("Circumference  of Circle with int radius value =" +(pi*radius*2));
	  s.close();
	}
}
