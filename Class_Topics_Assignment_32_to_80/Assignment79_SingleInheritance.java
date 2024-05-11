//Program of Single level inheritance
package Class_Topics_Assignment;


	class Inheritance_ParentClass
	{
		static void parent()
		{
			System.out.println("Parent method");
		}
	}

	public class Assignment79_SingleInheritance extends Inheritance_ParentClass
	{
		static void child()
		{
			System.out.println("child method");
		}
	 
		public static void main(String[] args) {
	 
			child();
			parent();  //as inheritimg so child is also able to inherit parent methid herefire we can call it

		}

}
