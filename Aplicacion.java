import clases.Algoritmos;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú interactivo para elegir qué operación realizar
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Verificar si un número es par");
            System.out.println("2. Verificar si un número es primo");
            System.out.println("3. Invertir un String");
            System.out.println("4. Verificar si un String es un palíndromo");
            System.out.println("5. Imprimir la secuencia FizzBuzz");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    // Verificar si un número es par
                    System.out.print("Introduce un número: ");
                    int numeroPar = scanner.nextInt();
                    if (Algoritmos.esPar(numeroPar)) {
                        System.out.println("El número " + numeroPar + " es par.");
                    } else {
                        System.out.println("El número " + numeroPar + " es impar.");
                    }
                    break;

                case 2:
                    // Verificar si un número es primo
                    System.out.print("Introduce un número: ");
                    int numeroPrimo = scanner.nextInt();
                    if (Algoritmos.esPrimo(numeroPrimo)) {
                        System.out.println("El número " + numeroPrimo + " es primo.");
                    } else {
                        System.out.println("El número " + numeroPrimo + " no es primo.");
                    }
                    break;

                case 3:
                    // Invertir un String
                    System.out.print("Introduce un texto: ");
                    String textoReversa = scanner.nextLine();
                    System.out.println("El texto invertido es: " + Algoritmos.stringEnReversa(textoReversa));
                    break;

                case 4:
                    // Verificar si un String es un palíndromo
                    System.out.print("Introduce un texto: ");
                    String textoPalindromo = scanner.nextLine();
                    if (Algoritmos.esPalindromo(textoPalindromo)) {
                        System.out.println("El texto es un palíndromo.");
                    } else {
                        System.out.println("El texto no es un palíndromo.");
                    }
                    break;

                case 5:
                    // Imprimir la secuencia FizzBuzz
                    System.out.print("Introduce un número para la secuencia FizzBuzz: ");
                    int numeroFizzBuzz = scanner.nextInt();
                    Algoritmos.secuenciaFizzBuzz(numeroFizzBuzz);
                    break;

                case 6:
                    // Salir
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
    }
}
