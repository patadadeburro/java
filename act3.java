/*

Descripcion: Convierte de un unidad a otra.
referencias: 
			 wikipedibyte
			 https://es.wikipedia.org/wiki/Byte
*/
import java.util.Scanner;
public class act3{

	public void menu(  ){
		System.out.println( "Este programa convierte de una unidad de amacenamiento de informacion a otra." );
		System.out.println( "" );
		System.out.println( "Unidades" );
		System.out.println( "--------" );
		System.out.println( "1. BITS " );
		System.out.println( "2. bytes" );
		System.out.println( "3. KB   " );
		System.out.println( "4. MB   " );
		System.out.println( "5. GB   " );
		System.out.println( "6. TB   " );
		System.out.println( "" );
	}

	// Convierte una cantidad a Bytes
	public double ConvierteABytes( double cantidad, int unidadOrigen ){
		double resultado = 0;
		switch( unidadOrigen ){
			// convierte de Bits a Bytes
			case 1: resultado = cantidad / 8.0; break;

			// la cantidad  ya esta en Bytes.
			case 2: resultado = cantidad       ; break;
			
			// convierte de KB a Bytes
			case 3: resultado = cantidad * 1e3 ; break;
			
			// converite de MB a Bytes
			case 4: resultado = cantidad * 1e6 ; break;
			
			// convierte de GB a Bytes
			case 5: resultado = cantidad * 1e9 ; break;
			
			// conviete de TB a Bytes
			case 6: resultado = cantidad * 1e12; break;
		}
		return resultado;
	}

	// Convierte desde Bytes a otra Unidad de Almacenamineto
	public double ConvierteDesdeBytes( double cantidad, int unidadDestino ){
		// declaramos una variable local dentro de esta funcion.
		double resultado = 0;

		// calculamos
		switch( unidadDestino ){
			// convierte de Bits a Bytes
			case 1: resultado = cantidad / 8.0 ; break;

			// la cantidad x ya est aen bytes.
			case 2: resultado = cantidad       ; break;
			
			// convierte de KB a Bytes
			case 3: resultado = cantidad * 1e3 ; break;
			
			// converite de MB a Bytes
			case 4: resultado = cantidad * 1e6 ; break;
			
			// convierte de GB a Bytes
			case 5: resultado = cantidad * 1e9 ; break;
			
			// conviete de TB a Bytes
			case 6: resultado = cantidad * 1e12; break;
		}

		// devolvemos el resultado
		return resultado;
	}


	public void Corre(){

		// declaramos unas variables
		int    unidadOrigen, unidadDestino; 
		double cantidad, bytes, resultado;

		// imprime mensajes y menu
		menu();

		// lee datos del usuario
		Scanner in = new Scanner(System.in);

		System.out.println("introduzca cantidad");
		cantidad = in.nextDouble();

		System.out.println("introduzca unidad Origen");
		unidadOrigen = in.nextInt();

		System.out.println("introduzca unidad Destino");
		unidadDestino = in.nextInt();
		in.close();

		// calcula
		bytes = ConvierteABytes( cantidad, unidadOrigen );
		resultado = ConvierteDesdeBytes( bytes , unidadDestino );

		// imprime resultado
		System.out.printf( "resultado: %.3f \n", resultado );
	}

	public static void main(String args[]){

		// creamos una instancia de la clase act3.
		// es decir creamos un objeto.
		act3 miObjeto = new act3();

		// mandamos llamar el metodo corre
		miObjeto.Corre();
	}
 }