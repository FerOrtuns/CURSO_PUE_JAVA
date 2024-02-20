package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

/*
Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el DNI completo. Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado debe estar entre 0 y 22. Haz un método donde según el resultado de la anterior formula busque en un array de caracteres la posición que corresponda a la letra. Esta es la tabla de caracteres:
0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22
T  R  W  A  G  M  Y  F  P  D  X  B  N  J  Z  S  Q  V  H  L  C  K  E
Por ejemplo, si introduzco 70588387, el resultado sera de 7 que corresponde a ‘F’.
 */

import java.util.Scanner;

public class Ejercicio9 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        askForDni();
    }

    private static void askForDni() {

        String dni;

        do {

            System.out.println("Enter your ID number (Only 8 numeric characters):");
            dni = sc.nextLine();

        } while (dni.length() < 0 || dni.length() > 8);

        calculateDniLetter(Integer.parseInt(dni));

    }

    private static void calculateDniLetter(int dni) {

        char[] arrayLetter = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int dniLetter = (dni % 23);
        String completeDni = String.valueOf(dni + "-" + arrayLetter[dniLetter]);
        System.out.println("Your full dni with its letter is: " + completeDni);

    }

}
