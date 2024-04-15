//Out of so many lagacy class in any one class i want you to iterate using Enumeration

package assignments_grotech;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment30_IterateUsingEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v=new Vector();
		
		v.addElement(97);
		v.addElement(87880.000);
		v.addElement(null); 
		v.add(null);
		v.addElement(987);  
		v.addElement('A');
		System.out.println(v);
		
		System.out.println("\n------------------Iterate through Enumeration()------------------");
		//only forward direction 
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
