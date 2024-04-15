//Exception Handling Program using Array concept
package assignments_grotech;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment23_ExceptionHandling_ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {	
	int a[]=new int[2];
	
	for(int i=0;i<2 ;i++)
	{
		Scanner s1=new Scanner(System.in);
		 a[i]=s1.nextInt();
		
	}
	System.out.println(Arrays.toString(a));
	}
	catch(ArrayIndexOutOfBoundsException a4)
	{
		System.out.println("I have handled ArrayIndexOutOfBoundsExceptionwhich occured in try block ");
	}
		
		
	}

}
