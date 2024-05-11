//To print alternate numbers using FOR LOOP from 1 to 100 using FOR loop
package Class_Topics_Assignment;

public class Assignment74_Alternative1To100_UsingForLoop  {

	

	public static void main(String[] args) throws InterruptedException {
		
		 for(int i=1;i<=100;i=i+2)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
