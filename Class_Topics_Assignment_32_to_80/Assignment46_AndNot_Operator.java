//A program to check the age and salary to print a statement using AND _NOT operator

package Class_Topics_Assignment;

public class Assignment46_AndNot_Operator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=54 ,salary=72000;
		if(!(age>18 && salary==50000))
			System.out.println("1");
		else if (!(age>18 && salary==72000))
			System.out.println("2");
		else
		    System.out.println("3");
	}
	
}
