//Create an object for SIB IIB Constructors and observe how it works and this program have one sib,iib,constuctor
package Class_Topics_Assignment;

public class Assignment56_SIB_IIB_Constructor_OrderOfExecution {


	//SIB Declaration
	static
	{
		System.out.println("SIB calling");
	}
	
	//IIB Declaration
	{
		System.out.println( "IIB calling");
	}
	
	//Constructor Declaration
	Assignment56_SIB_IIB_Constructor_OrderOfExecution()
	{
		System.out.println("Constructor calling");
	}
	
	//Main Declaration
	public static void main(String[] args) {
		
	

		
    new Assignment56_SIB_IIB_Constructor_OrderOfExecution();
	}
}
