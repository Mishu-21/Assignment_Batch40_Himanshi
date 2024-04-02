//Create Multi level Inheritance using 2 Abstract classes and 1 concrete class by creating 2 AbsMethods in Absclass1,creating 2 AbsMethods, 1 ConcreteMethod in Abssclass2, and 2 Concrete methods in Child class(Concrete class)

package assignments_grotech;


//having 2 AM and 1CM
abstract class Abstract_1
{
	abstract public void abstractMethod1();
	abstract public void abstractMethod2();
	
	public void Concrete_method_nonstatic_1()
	{
		System.out.println("Concrete method nonstatic 1");
	}
	
}


//having 2 AM and 1CM
abstract class Abstract_2 extends Abstract_1
{
  //can implement here or down class also 
	public void abstractMethod1() {
		System.out.println("Abstract Method 1");
		
	}

	@Override
	public void abstractMethod2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method 2");
		
	}
	
	
	abstract public void abstractMethod3();
	abstract public void abstractMethod4();
	
	public static  void Concrete_method_static_2()
	{
		System.out.println("Concrete method static 2");
	}
	
	public void Concrete_method_nonstatic_1()
	{
		System.out.println("Concrete method nonstatic 1 overridden method ");
	}
	
	
}

public class Assignment16_Abstract_Concrete_concept extends Abstract_2 {

	/*
	 * @Override public void abstractMethod1() {
	 * System.out.println("Abstract Method 1");
	 * 
	 * }
	 * 
	 * @Override public void abstractMethod2() { // TODO Auto-generated method stub
	 * System.out.println("Abstract Method 2");
	 * 
	 * }
	 */
	public void abstractMethod3() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method 3");
	}

	@Override
	public void abstractMethod4() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method 4");
	}
	
	public void Concrete_method_nonstatic_3()
	{
		System.out.println("Concrete method nonstatic 3");
	}
	
	
	public  static void Concrete_method_static_4()
	{
		System.out.println("Concrete method static 4");
	}
	
  public static void main(String[] args) {
	  Assignment16_Abstract_Concrete_concept a16= new Assignment16_Abstract_Concrete_concept();
	  
	  a16.abstractMethod1();
	  a16.abstractMethod2();
	  a16.Concrete_method_nonstatic_1();
	  a16.abstractMethod3();
	  a16.abstractMethod4();
	  Concrete_method_static_2();
	  a16.Concrete_method_nonstatic_3();
	  Concrete_method_static_4();
	  
}
}
