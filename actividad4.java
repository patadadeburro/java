/* 
actividad4
4. Leer las longitudes de los tres lados de un triángulo (L1, L2 y L3) y calcule el
área del mismo de acuerdo con la siguiente fórmula : 
Area = ( T (T-L1) (T-L2) (T-L3) ) ^ 0.5
donde : T = (L1 + L2 + L3 ) / 2 

*/

import java.util.Scanner;
public class actividad4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		 
		 System.out.println("introduzca la longitud del lado 1");
		 float l1 = in.nextFloat();
		 
		 System.out.println("introduzca la longitud del lado 2");
		 float l2 = in.nextFloat();
		
		System.out.println("introduzca la longitud del lado 3 ");
		float l3 = in.nextFloat();
		
		/*
		double area =(double)math.pow
         double  T = (l1 + l2 + l3 ) / 2 ;
		 ( T *(T-l1)*(T-l2)*(T-l3) ) 0.5;
		*/

		// AAT
		double  T = (l1 + l2 + l3 ) / 2 ;

		// El metodo Math.pow(), se escribe con la M Mayuscula
		// ejemplo:
		// si quieres calcular el cuadrado de 5
		// cuadrado = Math.pow( 5, 2 ) 
		// la compu hace las siguients operaciones
		//  cuadrado  = 5 ^2 = 5 * 5 = 25
		double area = Math.pow( ( T *(T-l1)*(T-l2)*(T-l3) ),  0.5 );
		
		System.out.println( "T: " + T );
		System.out.println( " el area del triangulo es: " + area );


		in.close(); 
	}
}	