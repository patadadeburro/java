/*
Practica 3 - 1.

1. Capturar los valores de las variables A y B y escriba el resultado de la operación: 
      
        A + B
      ---------
          3

*/

import java.util.Scanner;

public class p3_1_1 {

    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);  // Reading from System.in

        System.out.println ( "capture valor de A: " );
        float a = in.nextFloat(); 

        System.out.println ( "capture valor de B: " );
        float b = in.nextFloat();

        float c = ( a + b ) / 3; 


        System.out.println( "el resultado de (A+B) / 3 es: " + c );
        in.close();
    }

}
