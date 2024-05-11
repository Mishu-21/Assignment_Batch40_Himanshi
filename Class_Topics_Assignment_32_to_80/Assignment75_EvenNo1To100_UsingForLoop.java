//To print even numbers from 1 to 100 using FOR loop
package Class_Topics_Assignment;

public class Assignment75_EvenNo1To100_UsingForLoop {
	public static void main(String[] args) throws InterruptedException {
		
		 for(int i=1;i<=100;i++)
		{
			 if(i%2==0)
			 {
				 System.out.println(i);
					Thread.sleep(1000);
			 }
			
		}
	}
}
