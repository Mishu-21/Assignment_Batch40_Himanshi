//Create 4 static method with different name and call it inside the main method.


package assignments_grotech;

public class Assignment2_StaticMethod4_CallInMainMethod {
	
	public static void add()
	{
		System.out.println("calling static add method");
	}
	
    static void sub()
	{
		System.out.println("Calling static sub method");

	}
	
	static int mult()
	{
		System.out.println("Calling static mult method");

		return 0;
	}
	
    static void Div()
	{
		System.out.println("calling static div method");
		
	}
	
	public static void main(String[] args) {
                add();
                sub();
                mult();
                Div();
	}

}
