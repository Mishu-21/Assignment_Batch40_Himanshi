/*Q1) Refer "Arrays problems" sheet and print accordingly
 
Problem1
Roll No	Student Name	Gender	Mobile Number		4 Arrays
1	Kushal Z	M	968574		sysout
2	Kushal P	M	857412		sysoutln
3	Vishal Prasad	M	857421		concat
4	Monica Rawat	F	968521		
5	Kushagra Verma	M	967452		*/

package assignments_grotech;

public class Assignment22_Ques1_Problem1 {

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
	
	System.out.println("Roll No\t\t".concat("Student Name\t").concat("\tGender\t\t").concat("Mobile Number"));
	
	for(int i=0;i<5;i++)
	{
		System.out.print(roll_no[i] +"\t\t");
		System.out.print(Name[i]+"\t");
		System.out.print("\t" +Gender[i]+"\t");
		System.out.print("\t" +Mobile_Number[i]);
		System.out.println();
		
	}
		

	}

}
