package curso.ejercicios.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

// Write a program that generates a random number and asks the user to guess what the number is. If the user’s guess is higher than the random number, the program should display Too high, try again. If the user’s guess is lower than the random number, the program should display Too low, try again. The program should use a loop that repeats until the user correctly guesses the random number.
public class Ejercicio5 {

    private static Scanner sc = new Scanner(System.in);
    private static int numeroAleatorio;

    public static void main(String[] args) {

        int numeroMenu = 0;

        do {

            try {

                System.out.println("Pulsa '1' para jugar. Tendras que adivinar un numero entre 1 y 100.");
                System.out.println("Pulsa '0' para finalizar el programa.");
                numeroMenu = sc.nextInt();

                if (numeroMenu == 1) {

                    generarNumeroAleatorio();
                    introducirNumero();

                } else if (numeroMenu == 0) {

                    break;

                } else {

                    System.out.println("No introduciste un numero adecuado.");

                }

            } catch (InputMismatchException e) {

                System.out.println("Error: Ingresa un valor válido.");
                sc.nextLine();

            }

        } while (numeroMenu != 0);

        System.out.println("Programa finalizado.");
    }

    private static void introducirNumero() {

        int numeroUsuario = -1;

        do {

            try {

                System.out.println("Introduce un numero entre 0 y 100.");
                numeroUsuario = sc.nextInt();

                if (numeroUsuario >= 0 && numeroUsuario <= 100) {

                    compararNumeros(numeroUsuario);

                } else {

                    System.out.println("Introduce un numero valido.");

                }

            } catch (InputMismatchException e) {

                System.out.println("Error: Introduciste un caracter o valor inadecuado.");
                sc.nextLine();

            }

        } while (numeroUsuario < 0 || numeroUsuario > 100);

    }

    private static void compararNumeros(int numeroUsuario) {

        while (numeroAleatorio != numeroUsuario) {

            try {

                if (numeroAleatorio < numeroUsuario) {

                    System.out.println("El numero que introduciste es mayor.");

                } else if (numeroAleatorio > numeroUsuario) {

                    System.out.println("El numero que introduciste es menor.");

                }

                numeroUsuario = sc.nextInt();

            } catch (InputMismatchException e) {

                System.out.println("Error: Introduciste un caracter o valor inadecuado.");

                sc.nextLine();

            }

        }

        System.out.println("ACERTASTE!!");

    }

    private static void generarNumeroAleatorio() {
        numeroAleatorio = (int) (Math.random() * 100);
    }

}
