package assignments_grotech;

public class Assignment6_Blocks_Execution_Static_Main_IIb_Constructor {
	
	//SIB Declaration
        static
		{
          System.out.println("SIB calling");
        }

       //IIB Declaration
       {
         System.out.println( "IIB calling");
       }

		//Constructor Declaration
		Assignment6_Blocks_Execution_Static_Main_IIb_Constructor()
		{
		  System.out.println("Constructor calling");
		}
	
public static void main(String[] args) {
	
	Assignment6_Blocks_Execution_Static_Main_IIb_Constructor b2= new Assignment6_Blocks_Execution_Static_Main_IIb_Constructor();

			System.out.println("Main calling");

			 Assignment6_Blocks_Execution_Static_Main_IIb_Constructor b1= new Assignment6_Blocks_Execution_Static_Main_IIb_Constructor();

}
}
