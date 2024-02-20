package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

//  Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados, por último nos indica cual es el mayor de todos. Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo métodos que necesites.

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();
    private static int[] array;

    public static void main(String[] args) {

        createArrayAndSize();
        fillArrayWithPrimeNumbers();
        showPrimeNumbers();
        biggestNumber();

    }

    private static void createArrayAndSize() {

        System.out.println("Enter a number to choose the array size.");
        int size = sc.nextInt();
        array = new int[size];

    }

    private static void fillArrayWithPrimeNumbers() {

        for (int i = 0; i < array.length; i++) {

            int primeNumber;

            do {

                primeNumber = random.nextInt(100);

            } while (!isPrime(primeNumber));

            array[i] = primeNumber;

        }

    }

    private static void showPrimeNumbers() {

        System.out.print("The prime numbers are: ");

        for (int valor : array) {

            System.out.print(valor + " ,");

        }

    }

    private static void biggestNumber() {

        int biggest = 0;

        for (int valor : array) {

            if (valor > biggest) {

                biggest = valor;

            }

        }

        System.out.println("The biggest number is: " + biggest);

    }

    // Utilice ChatGPT para sacar esta funcion.
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;

    }

}
