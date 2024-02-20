package curso.ejercicios.ejercicio2;

import java.util.Scanner;

// Realiza un programa que pregunte al usuario un número X.  El programa ha de mostrar  todos los números primos que existen desde 0 hasta X incluido.
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo para verificar si es primo: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
