//Program on Constructor Overloading 

package Class_Topics_Assignment;

public class Assignment36_ConstrctorOverloading{

	//Can multiple Constructor but different arguments
	Assignment36_ConstrctorOverloading(int a)
		{
			System.out.println("1");
		}
	Assignment36_ConstrctorOverloading()
		{
			System.out.println("3");
		}
	Assignment36_ConstrctorOverloading(double a)
		{
			System.out.println("2");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// new ConstructorOverloading();  //Error as aisa method ek bhi define nhi kiya hai
			
	      //  new ConstructorOverloading(0.0); //Double constructor calling
	        new Assignment36_ConstrctorOverloading(0); //int constructor
	        new Assignment36_ConstrctorOverloading(); 
	       
	        Assignment36_ConstrctorOverloading c1=new Assignment36_ConstrctorOverloading(0.0);//Double constructor calling
	        
		}

}
