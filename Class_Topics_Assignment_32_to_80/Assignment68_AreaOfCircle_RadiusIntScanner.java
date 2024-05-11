//Program of Area of the circle where the r is using int datatype using Scanner class

package Class_Topics_Assignment;

import java.util.Scanner;

public class Assignment68_AreaOfCircle_RadiusIntScanner {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter int radius value");
	int radius=s.nextInt();
	  System.out.println("Area of Circle with int radius value =" +(3.14*radius*radius));
	  s.close();
	}
}
