//From 1 to 100, print Even and Odd numbers
package assignments_grotech;

public class Assignment12_1To100_EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1st way
		 * for(int i=1;i<=100;i++)
		 * 
		 * { if((i%2)==0) System.out.println("Even No=" +i); else
		 * System.out.println("Odd No=" +i); }
		 */
		
		// ----------------------------OR-----------------------
		System.out.println("Even no. from 1 to 100");
		for(int i=1;i<=100;i++)
			 { 
			    if((i%2)==0) 
				  System.out.println(i);
			 }
		
		System.out.println("Odd no. from 1 to 100");
		for(int i=1;i<=100;i++)
		 { 
		    if(!((i%2)==0)) 
			  System.out.println(i);
		 }
	}

}
