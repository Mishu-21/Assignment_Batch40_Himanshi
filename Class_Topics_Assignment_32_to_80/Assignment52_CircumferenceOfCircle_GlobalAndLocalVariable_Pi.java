//To calculate the Area of the circle using Local and Global variable pi=3.14

package Class_Topics_Assignment;

public class Assignment52_CircumferenceOfCircle_GlobalAndLocalVariable_Pi {

	static double pi =3.14; //gloabl variable
	
	public static void circumference ()
	{int r=5;
		double pi =3.14; //local variable
		System.out.println("Circumference of circle using local variable " + (2*pi*r));

	}
	public static void main(String[] args) {
		int r=10;

		System.out.println("Circumference of circle using Global variable " + (2*pi*r));
		circumference();	
	}
}
