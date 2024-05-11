//Write a program to find the Area of circle with radius as human input and pi declared as FiNAL VARIABLE

package Class_Topics_Assignment;

import java.util.Scanner;

public class Assignment65_AreaOfCircle_RadiusScanner_PiGlobal {
	static double pi=3.14;
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter int radius value");
	int radius=s.nextInt();
  System.out.println("Area of Circle with int radius value =" +(pi*radius*radius));
  s.close();
}
}
