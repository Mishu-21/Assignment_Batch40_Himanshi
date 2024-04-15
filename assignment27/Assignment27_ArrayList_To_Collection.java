//Just check if you can upcast from arraylist to collection and utilise its method

package assignments_grotech;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment27_ArrayList_To_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c=new ArrayList();  //upcast ArrayList to Colection 
		
		System.out.println("Try utilise different ArrayList method with collcetion (I)");
		System.out.println("\n\n--------------------------------------add()---------------------------------");
		c.add(7979);
		c.add(79);
		c.add('a');
		
		c.add(null);
		c.add(729);
		c.add("Himsh9");
		
	
		c.add(null);
		c.add(79);
		c.add("79.79");
		System.out.println("Elements in c object collection: " +c);
		
		Collection c1=new ArrayList(); 
		System.out.println("\n\n\n-------------------------------------addAll()---------------------------------");	
	c1.addAll(c);
	System.out.println("Elements in c1 object collection: " +c1);
	
	System.out.println("\n\n\n-------------------------------------remove()---------------------------------");	
	System.out.println("Try to remove the element which is not present: "+c.remove('b'));  //if element is not present
	System.out.println("Elements in c object collection: " +c);
	System.out.println("Try to remove the element which is  present: "+c.remove('a')); //if element is present
	System.out.println("Elements in c object collection: " +c);

	System.out.println("\n\n\n-------------------------------------removeAll()---------------------------------");	

	System.out.println(c1.removeAll(c));
	System.out.println("Elements in c object collection: " +c);
	System.out.println("Elements in c1 object collection: " +c1);
	
	
	System.out.println("\n\n\n-------------------------------------clear()---------------------------------");	
    c1.clear();
    System.out.println("After using clear()with c1,elements in c1 are: " +c1);
	
    
    
	System.out.println("\n\n\n-------------------------------------contains()---------------------------------");	
    System.out.println("Check the element which is not present in  the collection: "+c.contains(90));
    System.out.println("Check the element which is  present in  the collection: "+c.contains(null));

	
	System.out.println("\n\n\n-------------------------------------size()---------------------------------");	
  System.out.println("Size of c1 collection:" +c1.size());
  System.out.println("Size of c collection:" +c.size());
	
	System.out.println("\n\n\n-------------------------------------get()---------------------------------");	
    System.out.println("Collection(I) cannot utilise get() method");
	
	System.out.println("\n\n\n-------------------------------------set()---------------------------------");	
	 System.out.println("Collection(I) cannot utilise set() method");
	
	System.out.println("\n\n\n-------------------------------------indexOf()---------------------------------");	
	 System.out.println("Collection(I) cannot utilise indexOf() method");
	
	System.out.println("\n\n\n-------------------------------------Iterator()---------------------------------");	
  

	System.out.println("Elements in c1 Colection: " +c1);
	System.out.println("Elements in c1 Colection: " +c);
	System.out.println("\nMethod1: iterate using Iterator");
	System.out.println("      ---->iterator c1 collection");
   Iterator i=c1.iterator();
   while(i.hasNext()==true)  
	{
		 
		System.out.println(i.next());
		
	}
   System.out.println("      ---->iterator c collection");
   Iterator i1=c.iterator();
   while(i1.hasNext()==true)  
	{
		 
		System.out.println(i1.next());
		
	}
 
   
   System.out.println("\nMethod2: iterate using ListIterator");
 //  ListIterator i2 =c.listIterator(); 
	System.out.println("Cannot use ListItertor() with collection(I)");
 System.out.println("when tried to use giving ---->The method listIterator() is undefined for the type Collection Error  ");
	
	}

}
