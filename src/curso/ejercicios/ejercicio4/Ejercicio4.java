package curso.ejercicios.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

// Dado una palabra en Java (String), mostrar por la consola el número de vocales
public class Ejercicio4 {

    private static int letraA = 0, letraE = 0, letraI = 0, letraO = 0, letraU = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numeroMenu = 0;

        do {

            try {

                System.out.println("Pulsa '1' para contar las vocales de una palabra.");
                System.out.println("Pulsa '0' para finalizar el programa.");
                numeroMenu = sc.nextInt();

                if (numeroMenu == 1) {

                    System.out.println("Introduce una palabra:");
                    String palabra = sc.next();
                    contarVocales(palabra);

                } else if (numeroMenu == 0) {

                    break;

                } else if (numeroMenu != 1 && numeroMenu != 0) {

                    System.out.println("No has introducido un valor correcto.");

                }


            } catch (InputMismatchException e) {

                System.out.println("Error: Ingresa un valor numérico válido.");
                sc.nextLine();

            }

        } while (numeroMenu != 0);


        System.out.println("Programa Finalizado.");

    }

    public static void contarVocales(String palabra) {

        for (int i = 0; i < palabra.length(); i++) {

            boolean verdadero = true;

            do {

                if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {

                    letraA++;

                } else if (palabra.charAt(i) == 'e' || palabra.charAt(i) == 'E') {

                    letraE++;

                } else if (palabra.charAt(i) == 'i' || palabra.charAt(i) == 'I') {

                    letraI++;

                } else if (palabra.charAt(i) == 'o' || palabra.charAt(i) == 'O') {

                    letraO++;

                } else if (palabra.charAt(i) == 'u' || palabra.charAt(i) == 'U') {

                    letraU++;

                }

                verdadero = false;

            } while (verdadero);

        }

        mostrarVocales(palabra);

    }

    public static void mostrarVocales(String palabra) {

        System.out.println("La palabra que introduciste fue: " + palabra + " y las vocales que contiene fueron:");
        System.out.println(letraA + " letras 'a'.");
        System.out.println(letraE + " letras 'e'.");
        System.out.println(letraI + " letras 'i'.");
        System.out.println(letraO + " letras 'o'.");
        System.out.println(letraU + " letras 'u'.");
        System.out.println();
        resetearVariables();

    }

    public static void resetearVariables() {

        letraA = 0;
        letraE = 0;
        letraI = 0;
        letraO = 0;
        letraU = 0;

    }

}
