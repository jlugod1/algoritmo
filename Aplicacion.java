import clases.Algoritmos; 

public class Aplicacion {

    public static void main(String[] args) {
        // Prueba del método esPar
        System.out.println("¿4 es par? " + Algoritmos.esPar(4)); // Debería ser true
        System.out.println("¿7 es par? " + Algoritmos.esPar(7)); // Debería ser false

        // Prueba del método esPrimo
        /*
        System.out.println("¿5 es primo? " + Algoritmos.esPrimo(5)); // Debería ser true
        System.out.println("¿10 es primo? " + Algoritmos.esPrimo(10)); // Debería ser false
        System.out.println("¿1 es primo? " + Algoritmos.esPrimo(1)); // Debería ser false
        System.out.println("¿11 es primo? " + Algoritmos.esPrimo(11)); // Debería ser true
        */

        // Almacenar resultados en variables
        boolean esPar4 = Algoritmos.esPar(4);
        boolean esPar7 = Algoritmos.esPar(7);
        boolean esPrimo5 = Algoritmos.esPrimo(5);
        boolean esPrimo10 = Algoritmos.esPrimo(10);
        boolean esPrimo1 = Algoritmos.esPrimo(1);
        boolean esPrimo11 = Algoritmos.esPrimo(11);

        // Imprimir resultados
        System.out.println("¿4 es par? " + esPar4); // Debería ser true
        System.out.println("¿7 es par? " + esPar7); // Debería ser false
        System.out.println("¿5 es primo? " + esPrimo5);
        System.out.println("¿10 es primo? " + esPrimo10); 
        System.out.println("¿1 es primo? " + esPrimo1); 
        System.out.println("¿11 es primo? " + esPrimo11);
      
        // Resultado en variables: texto reverso
        String textoOriginal = "Hola Mundo";
        String textoReverso = Algoritmos.stringEnReversa(textoOriginal);
        System.out.println(textoReverso); //  "odnuM aloH"
    
        // Resultado en variables: verificar si una palabra es palíndromo
        String laPalabra = "reconocer";
        boolean textoEsPalindromo = Algoritmos.esPalindromo(laPalabra);
        System.out.println("¿'reconocer' es un palíndromo? " + textoEsPalindromo); // Imprime true o false
        
        // Impresión directa de otros casos (comentado)
        /*
        System.out.println("¿'reconocer' es un palíndromo? " + Algoritmos.esPalindromo("reconocer")); // true
        System.out.println("¿'hola' es un palíndromo? " + Algoritmos.esPalindromo("hola")); // false
        System.out.println("¿'Ana' es un palíndromo? " + Algoritmos.esPalindromo("Ana")); // true (sin importar mayúsculas)
        System.out.println("¿'oso' es un palíndromo? " + Algoritmos.esPalindromo("oso")); // true
        */
    String secuencia = Algoritmos.secuenciaFizzBuzz(15);

        // Imprimir el valor almacenado en la variable
        System.out.println("Secuencia FizzBuzz para 15:");
        System.out.println(secuencia); // Imprime la secuencia almacenada
   
   
    }
}