//create 5 static method and 5 non static method and call it inside main method a

package assignments_grotech;

public class Assignment4_Static_NonStatic_CallInMain {
	
	public static void Static_Add()
	{
		System.out.println("Calling Static Add Method");
	}
	
     static void Static_Sub()
	{
    	 System.out.println("Calling Static Sub Method");
	}
	
	 static int Static_Mult()
	{
		 System.out.println("Calling Static Mul Method");
		return 0; 
	}
	
	public static void Static_Div()
	{
		System.out.println("Calling Static Div Method");
	}
	
	public static void Static_Rem()
	{
		System.out.println("Calling Static Rem Method");
	}
	
	 public void NonStactic_Add()
	{
		 System.out.println("Calling NonStatic Add Method");
	}
	
	  void NonStactic_Sub()
	{
		  System.out.println("Calling NonStatic Sub Method");
	}
	
	public  void NonStactic_Mul()
	{
		System.out.println("Calling NonStatic Mul Method");
	}
	
	public  byte NonStactic_Div()
	{
		System.out.println("Calling NonStatic Div Method");
		return 0;
	}
	
	public  void NonStactic_Rem()
	{
		System.out.println("Calling NonStatic Rem Method");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("----First calling 5 Static Method Inside Main Method----");
		Static_Add();
		Static_Div();
		Static_Mult();
		Static_Rem();
		Static_Sub();
		
		 System.out.println("\n----Now calling 5 NonStatic Method Inside Main Method----");
		 Assignment4_Static_NonStatic_CallInMain a1 = new Assignment4_Static_NonStatic_CallInMain();
		 a1.NonStactic_Add();
		 a1.NonStactic_Div();
		 a1.NonStactic_Mul();
		 a1.NonStactic_Rem();
		 a1.NonStactic_Sub();
	}

}
