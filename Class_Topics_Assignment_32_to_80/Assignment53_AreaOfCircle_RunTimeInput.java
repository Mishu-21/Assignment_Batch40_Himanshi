//To calculate the Area of the circle by getting the run time input from the user

package Class_Topics_Assignment;
import java.util.Scanner;
public class Assignment53_AreaOfCircle_RunTimeInput {

 static double pi=3.14;
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter double radius value");
		Double radius=s.nextDouble();
		 System.out.println("Area of Circle with double radius value =" +(pi*radius*radius));
	      s.close();
		
	}
}
