package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

/*
Crea una aplicación que pida un numero por teclado y después comprobaremos si el numero introducido es capicua, es decir, que se lee igual sin importar la dirección. Por ejemplo, si introducimos 30303 es capicua, si introducimos 30430 no es capicua. Piensa como puedes dar la vuelta al número. Una forma de pasar un número a un array es esta Character.getNumericValue(cadena.charAt(posicion)).
 */

import java.util.Scanner;

public class Ejercicio11 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number and we will tell you if it is capicua or not.");
        int number = sc.nextInt();

        if (isCapicua(number)) {

            System.out.println(number + " is capicua.");

        } else {

            System.out.println(number + " isn't capicua.");

        }

    }

    private static boolean isCapicua(int n) {

        String number = Integer.toString(n);
        int lenght = number.length();

        // Bucle con ayuda de chatGPT, tratar de hacer Ejercicio11_v2 para practicar
        for (int i = 0; i < lenght / 2; i++) {

            if (number.charAt(i) != number.charAt(lenght - 1 - i)) {

                return false;

            }

        }

        return true;

    }

}
