/* 
Actividad 5. leer 3 numeros e imprimirlos en forma descendente.
*/

import java.util.Scanner;

import javax.net.ssl.ExtendedSSLSession;
public class act11{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		 
		 System.out.println( "capture sexo (M/F):" );
		 char sexo = in.next().charAt(0);

       
         if ( sexo == 'F' ) 
         {
                System.out.println( "sexo Femenino" );
         }
         else if ( sexo == 'M' ) 
         {
            System.out.println( "sexo Masculino" );
         }
         else
         {
            System.out.println( "sexo incorrecto" );
         }
        
    
         
		in.close(); 
	}
}	