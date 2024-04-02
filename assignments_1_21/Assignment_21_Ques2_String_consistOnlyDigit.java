//Q2)Check if given String only consist of Digits

package assignments_grotech;

public class Assignment_21_Ques2_String_consistOnlyDigit {

	public static void main(String[] args) {
	
		String s="8080808080808";
		char c[]=s.toCharArray();
		
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			boolean b=Character.isDigit(c[i]);
			if(b==true)
				count++;
		}
		if(s.length()==count)
		{
			System.out.println("String consist only digit");
		}
		else
			
				System.out.println("String consist something else other than digit");

	}

}
