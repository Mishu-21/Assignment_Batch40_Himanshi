//Upcast treeeset to Set and know the behviour of Set interface

package assignments_grotech;

import java.util.Set;
import java.util.TreeSet;

public class Assignment26_TreeSet_To_Set {

	public static void main(String[] args) {
		
		System.out.println("-------------------Properties of Set(I)--------------------------");
		Set s1=new TreeSet();     //------>implicit
		//Set s1=(Set)new TreeSet();  ---->Explicit 
		s1.add(6868);
		s1.add(798989);
		s1.add(268);
		s1.add(9);
	
		s1.add(9);
		s1.add(9);
	
		System.out.println(s1);
		System.out.println("1.Doesnot follow indexing");
		System.out.println("2.Doesnot follow order of insertion");
		System.out.println("3.Dynamic in nature");
		System.out.println("4.Store homogenous value");
		System.out.println("5.sorted in nature ");
		System.out.println("6.Doesnot store  null value");
		System.out.println("7.Doesnot store duplicate value ");
	}

}
