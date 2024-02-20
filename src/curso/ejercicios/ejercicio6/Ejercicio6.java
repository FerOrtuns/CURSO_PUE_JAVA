package curso.ejercicios.ejercicio6;

import java.util.Scanner;

// Write a method in Java to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
public class Ejercicio6 {

    private static Scanner sc = new Scanner(System.in);
    private static int size = 5;

    public static void main(String[] args) {
        llenarArray();
    }

    public static void llenarArray() {

        int[] array = new int[size];

        System.out.println("Introduce " + size + " numeros en el array.");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        diferenciarNumeroLargoEntreNumeroCorto(array);
    }

    public static void diferenciarNumeroLargoEntreNumeroCorto(int[] array) {

        int[] nuevoArray = new int[size];
        int mayor = 0;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {

            if (array[i] > mayor) {

                mayor = array[i];

            }

            if (array[i] < menor) {

                menor = array[i];

            }

        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

    }

}
