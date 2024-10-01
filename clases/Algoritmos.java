
package clases;

public class Algoritmos {

    // Método para verificar si un número es par
    public static boolean (int num) {
        // Verifica siesPar el número es divisible entre 2
        if (num % 2 == 0) {
            return true; // Si es divisible, es par
        } else {
            return false; // Si no es divisible, es impar
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }

        // Verificar divisores desde 2 hasta num-1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // Si es divisible por i, no es primo
            }
        }
        return true; // Si no fue divisible por ningún número, es primo
    }

    /* 
    // 
    public static String stringEnReversa(String texto) {
        String reversa = // Inicializamos un String vacío para almacenar la cadena invertida

        // Recorremos el String desde el último índice hasta el primero
        for (int i = texto.length() - 1; i >= 0; i--) {
            reversa += texto(i); // Concatenamos cada carácter en orden inverso
        }
    */

    // Método para invertir un String
    public static String stringEnReversa(String texto) {
        String reversa = ""; // Inicializamos un String vacío para almacenar la cadena invertida

        // Recorremos el String desde el último índice hasta el primero
        for (int i = texto.length() - 1; i >= 0; i--) {
            reversa += texto.charAt(i); // Concatenamos cada carácter en orden inverso
        }

        return reversa; // Devolvemos la cadena invertida
    }

    // Método para verificar si un String es un palíndromo
    public static boolean esPalindromo(String texto) {
        // Convertir a minúsculas para que la comparación no sea sensible a mayúsculas
        texto = texto.toLowerCase();

        // Invertimos el texto
        String textoInvertido = stringEnReversa(texto);

        // Comparamos el texto original con el texto invertido
        return texto.equals(textoInvertido); // Retorna true si son iguales, false si no
    }
 // Método para la secuencia FizzBuzz
    // Método para la secuencia FizzBuzz
    public static String secuenciaFizzBuzz(int num) {
        String resultado = ""; // Inicializamos una cadena vacía
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado += "FizzBuzz "; // Agregar "FizzBuzz"
            } else if (i % 3 == 0) {
                resultado += "Fizz "; // Agregar "Fizz"
            } else if (i % 5 == 0) {
                resultado += "Buzz "; // Agregar "Buzz"
            } else {
                resultado += i + " "; // Agregar el número
            }
        }
        return resultado; // Devolver la secuencia como String
    }
}
/*Crea un paquete llamado clases.
Dentro del paquete clases crea un nuevo archivo para definir la clase Algoritmos.java
La clase Algoritmos se compondrá únicamente de métodos estáticos:
Crea el método estático esPar() el cual recibe como parámetro un número entero. Este método se encarga de retornar true si el número es par, false si el número es impar.
Crea el método estático esPrimo() el cual recibe como parámetro un número entero. Este método se encarga de retornar true si el número es primo, false de lo contrario. Un número primo es aquel que tiene únicamente dos divisores, el número 1 y el mismo número.
Crea el método estático stringEnReversa el cual recibe como parámetro un String. Este método se encarga de retornar el String recibido escrito de atrás hacia adelante. Recuerda que un String puede accederse con un índice, cada caracter representa una posición del String.
Crea el método estático esPalindromo el cual recibe como parámetro un String. Este método se encarga de retornar true si el String es un palíndromo, false de lo contrario. Un palíndromo es aquel texto que se escribe igual de izquierda a derecha y de derecha a izquierda.
*/