//Q1)Check if given String only consist of alpha

package assignments_grotech;

public class Assignment_21_Ques1_String_consistOnlyAphabet {

	public static void main(String[] args) {

		String s="Himanshi4Chauhan";
		char c[]=s.toCharArray();
		
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			boolean b=Character.isAlphabetic(c[i]);
			if(b==true)
				count++;
		}
		if(s.length()==count)
		{
			System.out.println("String consist only alphabet");
		}
		else
			
				System.out.println("String consist something else other than alphabet");
		
				

	}

}
