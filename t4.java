/* 

*/

import java.util.Scanner;
public class t4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		 
		 System.out.println( "capture valor de A:" );
		 float a = in.nextFloat();
		 
		 System.out.println( "capture valor de B:" );
         float b = in.nextFloat();
         
         System.out.println( "capture valor de C:" );
         float c = in.nextFloat();

         float mayor = 0.0f;
        
         if ( a > b )
         {
             if ( a > c)
             {
                 mayor = a;
                 System.out.println( "A es el numero mayor " );
             }
             else
             {
                 mayor = c;
                 System.out.println( "C es el numero mayor " );
             }
         }
         else
         {
            if ( b > c)
            {
                mayor = b;
                System.out.println( "B es el numero mayor " );
            }
            else
            {
                mayor = c;
                System.out.println( "C es el numero mayor " );
            }
         }
         

		
		System.out.println( "el numero mayor es:  " + mayor );
				

		in.close(); 
	}
}	