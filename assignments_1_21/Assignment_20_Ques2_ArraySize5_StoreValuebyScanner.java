//Question 2)Create a Array of length 5 & int datatype & Store value in it using scanner class
package assignments_grotech;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_20_Ques2_ArraySize5_StoreValuebyScanner {
	
	public static void main(String[] args) {
		
		int arr[]=new int[5];
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter value");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		s.close();
		
		/*
		 * wrong way which i was trying 
		 * for(int i=0;i<arr.length;i++) { System.out.println("enter the value" + (i+1)
		 * +"time:" ); Scanner s= new Scanner(System.in); int value=s.nextInt();
		 * 
		 * 
		 * 
		 * 
		 * } System.out.println(Arrays.toString(arr));
		 */
		
		
		
	}

}
