//Iterate Treeset elements using iterator and check if its possible to do from list Iterator?

package assignments_grotech;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Assignment29_IterateTreeSet {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(25);
		t.add(1);
		t.add(89);
		t.add(25578);
		t.add(357);
		t.add(25);
		System.out.println(t);
		
		System.out.println("-------------Iterate Through iterator-------------------------");
		Iterator i=t.iterator();
		while(i.hasNext()==true)
	    {
		    System.out.println(i.next());	
		}
		
	//	System.out.println("--------Check if its possible to iterate  from list Iterator-----------");
		//ListIterator i1 =t.listIterator(); //return type ListIterator(I)
		//shows the error---->The method listIterator() is undefined for the type TreeSet
	}
}
