//Create one static method, one non static method and one constructor and call them inside the main method

package Class_Topics_Assignment;

public class Assignment37_1Static_1NONStactic_1Constructor_Mainmethod {

	public static void StaticMethod() //Creating StaticMethod
	{
		System.out.println("Calling Static Method");
	}
    
	public void NonStaticMethod()  //Creating NonStaticMethod
    {
		System.out.println("Calling NonStatic Method");

    }
    public Assignment37_1Static_1NONStactic_1Constructor_Mainmethod() //Creating Constructor
    {
		System.out.println("Calling Constructor");

	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StaticMethod();  //calling static method
       
        //calling non static as well as constructor 
        //1 constructor will be called and when nonstatic methiod will be called than it is called method 
        Assignment37_1Static_1NONStactic_1Constructor_Mainmethod c1= new Assignment37_1Static_1NONStactic_1Constructor_Mainmethod();
       c1.NonStaticMethod();
       
       /*  this line output will be 
       1st constructor method 
       then non static because phle object bnaya so constructor invoke ho gaya
       n then jb call kiya reference variable ke through tb humara nonstatic method call hua   */ 
       
       //Another way of calling Constructor
       new Assignment37_1Static_1NONStactic_1Constructor_Mainmethod();
	}
	

}
