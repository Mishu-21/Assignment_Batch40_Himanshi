//Program of Area of the circle where the r is using double datatype using Scanner class

package Class_Topics_Assignment;

import java.util.Scanner;

public class Assignment67_AreaOfCircle_RadiusDoubleScanner {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter int radius value");
		double radius=s.nextDouble();
	  System.out.println("Area of Circle with int radius value =" +(3.14*radius*radius));
	  s.close();
	}
}
