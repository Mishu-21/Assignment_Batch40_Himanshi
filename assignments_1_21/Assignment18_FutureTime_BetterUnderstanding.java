//Find out future time in 10days

package assignments_grotech;
import java.util.*;

public class Assignment18_FutureTime_BetterUnderstanding {
	public static void main(String[] args) {
	
		Date d=new Date();
		System.out.println("Machine understandable time "+d.getTime()); //epoch time
		
		//convert epoch time into human understandable time 
		Date d2=new Date(d.getTime());
		System.out.println("PresentTime "+d2);
		
		//Future time in 10 days
		Date d3=new Date(d.getTime() +(1000*60*60*24*10));
		System.out.println("Future time after 10 days:"+d3);
		
		//to use String function on future time convert d3 into string 
		String FutureTime= d3.toString();
		
		//to have month
		String month=FutureTime.substring(4,7);
		System.out.println(month);
		
		//to have date
		String date=FutureTime.substring(8,10);
		System.out.println(date);
		
		//to have year
	    String year=FutureTime.substring(FutureTime.length()-4);
		System.out.println(year);
		
		System.out.println("Date in specific format");
		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		
		
		
	}
	
	

}
