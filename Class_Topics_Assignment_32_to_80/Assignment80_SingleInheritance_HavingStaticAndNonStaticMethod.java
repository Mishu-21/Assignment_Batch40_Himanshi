//Program of Single level inheritance having the both static and non static methods and call them in the main method

package Class_Topics_Assignment;

class Inheritance_Parent
{
	static void Static_Method_Parent()
	{
		System.out.println("Parent Static method");
	}
	
	void NonStatic_Method_Parent()
	{
		System.out.println("Parent NonStatic method");
	}
	
}
 
public class Assignment80_SingleInheritance_HavingStaticAndNonStaticMethod  extends Inheritance_Parent{

	static void Static_Method_Child()
	{
		System.out.println("Child Static method");
	}
	
	void NonStatic_Method_Child()
	{
		System.out.println("Child NonStatic method");
	}
	public static void main(String[] args) {
		Static_Method_Child();	
		Static_Method_Parent();
		
		
		Assignment80_SingleInheritance_HavingStaticAndNonStaticMethod a1=new Assignment80_SingleInheritance_HavingStaticAndNonStaticMethod();
		a1.NonStatic_Method_Child();
		a1.NonStatic_Method_Parent();
}
}

