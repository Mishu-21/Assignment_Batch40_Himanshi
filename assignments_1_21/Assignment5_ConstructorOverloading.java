//create 5 constructor and Call it in Main Method

package assignments_grotech;

public class Assignment5_ConstructorOverloading {
    
	Assignment5_ConstructorOverloading(int a) 
	{
	    System.out.println(a);
	}
  private 	Assignment5_ConstructorOverloading(char a) 
	{
		System.out.println(a);
	}
	 public Assignment5_ConstructorOverloading(String a) 
	{
		System.out.println(a);
	}
	protected Assignment5_ConstructorOverloading(boolean a) 
	{
		System.out.println(a);
	}
	Assignment5_ConstructorOverloading(int a,boolean b,String s) 
	{

		//doubt -->If u want to print few values of different dataTypes  in a single line
		
	   System.out.println(+a+ " "+b+ " " +s);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Assignment5_ConstructorOverloading(1);
         new Assignment5_ConstructorOverloading('a');
         new Assignment5_ConstructorOverloading("Object");
         new Assignment5_ConstructorOverloading(false);
         new Assignment5_ConstructorOverloading(0, true, "Himanshi");
		 
	}

}
