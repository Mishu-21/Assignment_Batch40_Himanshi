//Finding out the property of ArrayList,Vector,LinkedList,treeset,Priority Queue

package assignments_grotech;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.TreeSet;
import java.util.PriorityQueue;
public class Assignment24_Properties_Of_Different_Classes_InCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-------------------Properties of ArrayList<class>--------------------------");
		
		ArrayList a1=new ArrayList();
		a1.add(987);
		a1.add(97);
		a1.add("himanshui");
		a1.add(true);
		a1.add(87880.000);
		a1.add(null);
		a1.add(987);
		a1.add('A');
		a1.add(null);
		System.out.println(a1);
		System.out.println("1.Follow indexing");
		System.out.println("2.Follow order of insertion");
		System.out.println("3.Dynamic in nature");
		System.out.println("4.Store hetrogenous value");
		System.out.println("5.Not sorted");
		System.out.println("6.Store 'n' no. of null values");
		System.out.println("7.Store duplicate value ");
	
		System.out.println("\n\n\n\n-------------------Properties of Vector<class>--------------------------");
		Vector v=new Vector();
		v.add(987);  //add() method will also work to add element in the vector 
		v.addElement(97);
		v.add("himanshui");
		v.add(true);
		v.addElement(87880.000);
		v.addElement(null); 
		v.add(null);
		v.add(null);
		v.addElement(987);  
		v.addElement('A');
		System.out.println(v);
		System.out.println("1.Follow indexing");
		System.out.println("2.Follow order of insertion");
		System.out.println("3.Dynamic in nature");
		System.out.println("4.Store hetrogenous value");
		System.out.println("5.Not sorted");
		System.out.println("6.Store 'n' no. of null values");
		System.out.println("7.Store duplicate value ");
	
		
		System.out.println("\n\n\n\n-------------------Properties ofLinkedList<class>--------------------------");
		LinkedList l=new LinkedList();
		l.add(987);
		l.add(97);
		l.add("himanshui");
		l.add(true);
		l.add(87880.000);
		l.add(null);  
		l.add(null);
		l.add(null);
		l.add(987);  
		l.add('A');
		System.out.println(l);
		System.out.println("1.Follow indexing");
		System.out.println("2.Follow order of insertion");
		System.out.println("3.Dynamic in nature");
		System.out.println("4.Store hetrogenous value");
		System.out.println("5.Not sorted");
		System.out.println("6.Store 'n' no. of null values");
		System.out.println("7.Store duplicate value ");
	
		System.out.println("\n\n\n\n-------------------Properties of treeset<class>--------------------------");
		TreeSet t=new TreeSet();
		t.add(25);
		t.add(1);
		t.add(89);
		t.add(25578);
		t.add(357);
		t.add(25);
		System.out.println(t);
		System.out.println("1.Doesnot follow indexing");
		System.out.println("2.Doesnot follow order of insertion");
		System.out.println("3.Dynamic in nature");
		System.out.println("4.Store homogenous value");
		System.out.println("5.sorted in nature ");
		System.out.println("6.Doesnot store  null value");
		System.out.println("7.Doesnot store duplicate value ");
		
		System.out.println("\n\n\n\n-------------------Properties of Priority Queue<class>--------------------------");
		PriorityQueue p=new PriorityQueue();
		p.add("Welcome"); 
        p.add("To"); 
        p.add("Geeks"); 
        p.add("Geeks");
       // p.add(null);
        System.out.println(p);
        System.out.println("1.Doesnot follow indexing");
		System.out.println("2.Doesnot follow order of insertion");
		System.out.println("3.Dynamic in nature");
		System.out.println("4.Store homogenous value");
		System.out.println("5.sorted in nature ");
		System.out.println("6.Doesnot store  null value");
		System.out.println("7. Store duplicate value ");
	}

}
