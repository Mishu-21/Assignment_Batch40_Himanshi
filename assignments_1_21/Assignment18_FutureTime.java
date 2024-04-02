package assignments_grotech;

import java.util.Date;

public class Assignment18_FutureTime {
	
	
	public static void main(String[] args) {
		
		Date d=new Date();
		
		
		//convert epoch time into human understandable time 
		Date d2=new Date(d.getTime());
		
		
		//Future time in 10 days
		Date d3=new Date(d.getTime() +(1000*60*60*24*10));
		
		
		//to use String function on d3 convert d3 into string 
		String FutureTime= d3.toString();
		
		//to have month
		String month=FutureTime.substring(4,7);
		
		
		//to have date
		String date=FutureTime.substring(8,10);
		
		
		//to have year
	    String year=FutureTime.substring(FutureTime.length()-4);
		
		
		System.out.println("Date in specific format");
		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		
		
		
	}

}
