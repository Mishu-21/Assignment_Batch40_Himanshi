//Question 1)check in the given string how many Special characters are present

package assignments_grotech;

public class Assignment_20_Ques1_CountSpecialCharacter {
	
	static void no_of_Special_Charcater()
	{
		
		String s="Mani@h123 $# Kumar";
		int count=0;
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			boolean b =Character.isAlphabetic(c[i]);
			boolean b1 =Character.isDigit(c[i]);
			boolean b2 =Character.isSpaceChar(c[i]);
			
			if((b==true)||(b1==true)||(b2==true))
			{
				count++;
			}
		}
		int no_of_Special= (c.length)-(count);
		System.out.println("Number of special character present in a string is: "+no_of_Special);
	}
	
	public static void main(String[] args) {
		
		String s="Manish123 $# Kumar";
		int count_aplha=0, count_digit=0, count_space=0;
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			boolean b =Character.isAlphabetic(c[i]);
			boolean b1 =Character.isDigit(c[i]);
			boolean b2 =Character.isSpaceChar(c[i]);
			
			if(b==true)
			{
				count_aplha++;
			}
			if(b1==true)
			{
				count_digit++;
			}
			if(b2==true)
			{
				count_space++;
			}
		}
		int no_of_Special= (c.length)-(count_aplha+count_digit+count_space);
		System.out.println("Number of special character present in a string is: "+no_of_Special);
	
		System.out.println("Call no_of_Special_Charcater method ");
		no_of_Special_Charcater();

		
	}
}
