//Upcast arraylist to list and know the behviour of list interface

package assignments_grotech;

import java.util.ArrayList;
import java.util.List;

public class Assignment25_ArrayList_To_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------Properties of List(I)--------------------------");
		List l1=(List)new ArrayList();  //------>Explicitly 
//		List l1=new ArrayList();  ----->implicitly 
		
		l1.add(7979);
		l1.add(79);
		l1.add("7979");
		
		l1.add(null);
		l1.add(729);
		l1.add("Himsh9");
		
	
		l1.add(null);
		l1.add(79);
		l1.add("79.79");
		
		System.out.println(l1);
		System.out.println("1.Follow indexing");
		System.out.println("2.Follow order of insertion");
		System.out.println("3.Dynamic in nature");
		System.out.println("4.Store hetrogenous value");
		System.out.println("5.Not sorted");
		System.out.println("6.Store 'n' no. of null values");
		System.out.println("7.Store duplicate value ");
	}

}
