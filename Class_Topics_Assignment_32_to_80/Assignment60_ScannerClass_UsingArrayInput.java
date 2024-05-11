//Program on Scanner class using Arrays input

package Class_Topics_Assignment;

import java.util.Arrays;

import java.util.Scanner;
public class Assignment60_ScannerClass_UsingArrayInput {

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
		
	}
	

	
	
}
