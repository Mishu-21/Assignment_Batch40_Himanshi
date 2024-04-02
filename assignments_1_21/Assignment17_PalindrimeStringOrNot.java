//Palindrome input Scanner Class

package assignments_grotech;

import java.util.Scanner;

public class Assignment17_PalindrimeStringOrNot {
	
	public static void main(String[] args) {
		 
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the given String" );
		String s=s1.next();
		

		String output=""; //define without space
		for(int i= s.length()-1;i>=0;i--)
		{
			char rev=s.charAt(i);
			output=output+rev;
		}
		System.out.println("Reverse of the given String " +output);
		
		//Check if the given String is Palindrome or not 
		if(s.equals(output))
			System.out.println("Palindrome String");
		else 
			System.out.println("Not a Palindrome String");
		
		s1.close();
		
	}

}
