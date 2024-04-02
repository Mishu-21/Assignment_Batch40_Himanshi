//Q2)If the number divisible by 3 print frog ,If the number divisible by 5 print cat , If the number divisible by both 3&5 then print frog & cat

package assignments_grotech;

public class Assignment22_Ques2_Divisible {
	
	public static void main(String[] args) {
		
		int number=25;
		if(number%3==0)
			System.out.println("frog");
		
		if(number%5==0)
			System.out.println("cat");
		
		if((number%3==0)&&(number%5==0))
			System.out.println("frog and cat");
	}
	
}
