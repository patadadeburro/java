/* 
Actividad 5. leer 3 numeros e imprimirlos en forma descendente.
*/

import java.util.Scanner;

import javax.net.ssl.ExtendedSSLSession;
public class act5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		 
		 System.out.println( "capture valor de A:" );
		 float a = in.nextFloat();
		 
		 System.out.println( "capture valor de B:" );
         float b = in.nextFloat();
         
         System.out.println( "capture valor de C:" );
         float c = in.nextFloat();

       
         if ( a > b && a > c) 
         {
             // a es el mayor

             if ( b > c)
             {
                System.out.printf( "%.3f, %.3f, %.3f ", a, b, c );
             }
             else
             {
                System.out.printf( "%.3f, %.3f, %.3f ", a, c, b );
             }
         }
         else if ( b > a && b > c) 
         {
             // b es el mayor

            if ( a > c)
            {
               System.out.printf( "%.3f, %.3f, %.3f ", b, a, c );
            }
            else
            {
               System.out.printf( "%.3f, %.3f, %.3f ", b, c, a );
            }
        }
        else
        {
            // si a no es el mayor,
            // y b tampoco es el mayor
            // pues c debe ser el mayor!

            if ( a > b)
            {
               System.out.printf( "%.3f, %.3f, %.3f ", c, a, b );
            }
            else
            {
               System.out.printf( "%.3f, %.3f, %.3f ", c, b, a );
            }
            

        }
         
		in.close(); 
	}
}	