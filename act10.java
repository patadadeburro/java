/* 
Actividad 5. leer 3 numeros e imprimirlos en forma descendente.
*/

import java.util.Scanner;

import javax.net.ssl.ExtendedSSLSession;
public class act10{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		 
		 System.out.println( "capture edad:" );
		 int a = in.nextInt();

       
         if ( a > 0 && a < 120) 
         {
                System.out.println( "edad esta en el rango " );
         }
         else
         {
            System.out.println( "edad fuera de rango " );
         }
        
    
         
		in.close(); 
	}
}	