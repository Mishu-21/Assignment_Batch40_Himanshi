//A program to check the salary based on the age using NESTED IF ELSE statement

package Class_Topics_Assignment;

public class Assignment43_NestedIf_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int age=19;
		 double salary=10000;
		if(age>18)
		{
			if(salary>100000)
			   System.out.println("1");
			else
				System.out.println("2");
		}
		
		else
			System.out.println("3");

	}

}
