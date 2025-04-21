package clases;


public class Algoritmos {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esPrimo (int numero){

        if (numero <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
                }
            }
            return true;
        }

    public static String stringEnReversa(String texto) {
        StringBuilder reversa = new StringBuilder();

        for (int i = texto.length() -1; i >=0; i--) {
            reversa.append(texto.charAt(i));
        }

        return reversa.toString();
    }

    public static boolean esPalindromo (String texto) {
        String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();
        
        return textoLimpio.equals(stringEnReversa(textoLimpio));
    }

    public static void secuenciaFizzBuzz(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

}

