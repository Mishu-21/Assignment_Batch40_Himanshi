//To call the Constructor from  a different class

package Class_Topics_Assignment;

class parent
{
	//parent constructor
	parent()
	{
		System.out.println("parent constructor");
	}
}
public class Assignment35_CallConstructorFromDifferentClass {

	public static void main(String[] args) {
		new parent();
	}

}
