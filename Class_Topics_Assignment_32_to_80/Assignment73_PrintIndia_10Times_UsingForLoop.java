//Write a program to print INDIA 10 times using FOR loop using Thread keyword
package Class_Topics_Assignment;

public class Assignment73_PrintIndia_10Times_UsingForLoop {

	
	public static void main(String[] args) throws InterruptedException {
		
		 for(int i=1;i<=10;i++)
		{
			System.out.println("India");
			Thread.sleep(1000);
		}
	}
}
