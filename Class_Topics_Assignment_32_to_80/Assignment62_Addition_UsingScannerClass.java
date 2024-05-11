//Program of addition using Scanner class

package Class_Topics_Assignment;

import java.util.Scanner;

public class Assignment62_Addition_UsingScannerClass {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size ");
		
		int size1 =s.nextInt();
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0;i<size1;i++)
			{
			int value =s1.nextInt();
			sum=sum+value;
			}
		System.out.println("Sum: "+sum);
		
		s.close();
		s1.close();
		}
	}
	

