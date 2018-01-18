
//Realizar un programa con opciones y funciones. De acuerdo a la opcion convertir a bits, bytes,KB,MB,GB y TB.// 



import java.util.Scanner;

public class fun1{

    // una funcion puede acetar parametros y puede devolver algo.

    // esta es una funcion sin parametros y no devuelve nada, solo imprime un texto en la pantalla.
    public void MiSaludo() {
        System.out.println( "Hola amigos!" );
    }

    // esta es una funcion que acepta como  parametros dos numeros enteros, 
    // y devuelve un numero entero q es la suma de los dos parametros
    public int MiSuma( int a, int b ) {
        int suma = a + b;
        return suma;
    }

    // Esta es la funcion main de la clase
    public static void main(String args[]){


        // creamos una instancia de la clase fun1, es decir creamos un objeto f de tipo fun1.
        fun1 f = new fun1();

        // ahora usamos el objeto f, y llamamos a su funcion MiSaludo
        f.MiSaludo();


        // creamos una variable entera llamada s.
        int s = 0;

        // ahora usamos el objeto f, y llamamos a su funcion MiSuma.
        // como parametros usaremos los numeros 2 y 3. 
        // vamos a sumar los numeros 2 + 3, el resultado lo guardaremos en la variable s. 
        s = f.MiSuma( 2, 3 );
        System.out.printf( "2 +  3 =  %d ",  s );
    }
}