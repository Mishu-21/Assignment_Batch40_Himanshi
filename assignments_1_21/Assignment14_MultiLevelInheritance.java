//To create 5 classes for Multilevel Inheritance

package assignments_grotech;

class MutliLevel_1
{
	 void MutliLevel1_method()
	{
		System.out.println("MutliLevel1_method");
	}
}

class MutliLevel_2 extends MutliLevel_1
{
	static void MutliLevel2_method()
	{
		System.out.println("MutliLevel2_method");
	}
}

class MutliLevel_3 extends MutliLevel_2
{
	static void MutliLevel3_method()
	{
		System.out.println("MutliLevel3_method");
	}
}

class MutliLevel_4 extends MutliLevel_3
{
	 void MutliLevel4_method()
	{
		System.out.println("MutliLevel4_method");
	}
}

class MutliLevel_5 extends MutliLevel_4
{
	static void MutliLevel5_method()
	{
		System.out.println("MutliLevel5_method");
	}
}

public class Assignment14_MultiLevelInheritance extends MutliLevel_5
{

	static void MultiLevelInheritance()
	{
		System.out.println("MultiLevelInheritance");
	}
	public static void main(String[] args)
	{
		Assignment14_MultiLevelInheritance a1 = new Assignment14_MultiLevelInheritance();
		a1.MutliLevel1_method();
		MutliLevel2_method();
		MutliLevel3_method();
		a1.MutliLevel4_method();
		MutliLevel5_method();
		MultiLevelInheritance();
		
	}

}
