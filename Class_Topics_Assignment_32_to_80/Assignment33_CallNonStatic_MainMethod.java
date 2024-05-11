//To call non static method inside the main method

package Class_Topics_Assignment;

public class Assignment33_CallNonStatic_MainMethod {

	public 	void add()  //creating non static method as humne koi modifier nhi likha so bydefault it will be non-static 
	{
		System.out.println("Calling nonstatic method add");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Assignment33_CallNonStatic_MainMethod s1= new Assignment33_CallNonStatic_MainMethod();  // creating an object with its reference variable
		s1.add();  //calling a nonstatic method using reference variable/object    //can create in small or large
	}
}
