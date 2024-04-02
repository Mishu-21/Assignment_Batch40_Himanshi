/*Q1) Refer "Arrays problems" sheet and print accordingly

 Problem2
							
Student Name	Kushal Z	Kushal P	Vishal Prasad	Monica Rawat	Kushagra Verma		4 Arrays
Gender	M	M	M	F	M		
Mobile Number	968574	857412	857421	968521	967452		
Roll No	1	2	3	4	5		
							

*/

package assignments_grotech;

public class Assignment22_Ques1_Problem2 {

	public static void main(String[] args) {
		
		int roll_no[] =new int[5];
		roll_no[0]=1;
		roll_no[1]=2;
		roll_no[2]=3;
		roll_no[3]=4;
		roll_no[4]=5;
		
		String Name[]= {"kushal Z" ,"Kushal P","Vishal Prasad","Monica Rawat","Kushagra Verma"};
		
		char Gender[]= {'M','M','M','F','M'};
		
		int[] Mobile_Number= {968574,857412,857421,968521,967452};
		
		System.out.print("Student Name\t");
		for(int i =0;i<5;i++)
		{
			System.out.print(Name[i] +"\t");
		}
		
        System.out.println("");
        System.out.print("Gender\t\t");
        for(int i =0;i<5;i++)
		{
			System.out.print(Gender[i] +"\t\t");
		}
        
        System.out.println("");
        System.out.print("Mobile No.\t");
        for(int i =0;i<5;i++)
		{
			System.out.print(Mobile_Number[i] +"\t\t");
		}
        
        System.out.println("");
        System.out.print("Roll No.\t");
        for(int i =0;i<5;i++)
		{
			System.out.print(roll_no[i] +"\t\t");
		}
	}

}
