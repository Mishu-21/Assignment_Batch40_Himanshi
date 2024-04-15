//Iterate Arraylist elements using iterator and list Iterator

package assignments_grotech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment28_IterateArrayList {
	
	public static void main(String[] args) {
		
		
		ArrayList a1=new ArrayList();
		a1.add(24);
		a1.add("hima");
		a1.add("anis");
		a1.add(null);
		a1.add(9808.809);
		a1.add('a');
		a1.add(9808.809);
		System.out.println(a1);
		
		System.out.println("\n---------------Through Iterator------------------");
		Iterator i=a1.iterator();
		while(i.hasNext()==true)  
		{
			 System.out.println(i.next());
		
		}
		
		System.out.println("\n---------------Through ListIterator in forward direction ------------------");
		ListIterator i1 =a1.listIterator(); //return type ListIterator(I)
		while(i1.hasNext()==true)
			
		{
			System.out.println(i1.next());
		}
		System.out.println("\n---------------Through ListIterator in backward  direction ------------------");
		
		while(i1.hasPrevious()==true)
			
		{
			System.out.println(i1.previous());
		}
	}

}
