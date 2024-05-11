//Write a program to find the Area of circle with radius as human input and pi declared as  LOCAL VARIABLE

package Class_Topics_Assignment;
import java.util.Scanner;
public class Assignment64_AreaOfCircle_RadiusScanner_PiLocal {

	public static void main(String[] args) {
		double pi=3.14;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter int radius value");
		int radius=s.nextInt();
	  System.out.println("Area of Circle with int radius value =" +(pi*radius*radius));
	s.close();
	}
}
