//Utilise stack methods

package assignments_grotech;

import java.util.Stack;

public class Assignment31_StackMethods {

	public static void main(String[] args) {
		
		Stack s1=new Stack();
		s1.add(24);
		s1.add("hima");
		s1.add("anis");
		s1.add(null);
		s1.add(9808.809);
		s1.add('a');
		s1.add(9808.809);
		s1.add(890);
		System.out.println(s1);
		
		System.out.println("\n\n-----------------pop():Removes last object--------------------");
		System.out.println(s1.pop());
		System.out.println(s1);
		
		System.out.println("\n\n-----------------peek():looks at the last object without removing it from the stack --------------------");
		System.out.println(s1.peek());
		System.out.println(s1);
		
		System.out.println("\n\n-----------------push():It works exactly same as addElement--------------------");
		System.out.println(s1.push(89.09));
		System.out.println(s1);
		
		System.out.println("\n\n-----------------search():search the element in the stack --------------------");
		System.out.println(s1.search(90));  //if element is not in the stack
		System.out.println(s1.search('a')); //if element is present 
	}

}
