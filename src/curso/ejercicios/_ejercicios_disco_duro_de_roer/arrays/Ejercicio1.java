package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

//Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.

import java.util.Scanner;

public class Ejercicio1 {

    private static Scanner sc = new Scanner(System.in);
    private static final int TAMAÑO_ARRAY = 10;
    private static int[] array = new int[TAMAÑO_ARRAY];

    public static void main(String[] args) {

        System.out.println("Introduce " + TAMAÑO_ARRAY + " valores en el array:");
        llenarArray();
        mostrarValoresArray();

    }

    private static void llenarArray() {

        for (int i = 0; i < TAMAÑO_ARRAY; i++) {

            int valor = sc.nextInt();
            array[i] = valor;

        }

    }

    private static void mostrarValoresArray() {

        System.out.print("Los valores del array son: ");

        for (int valor : array) {

            System.out.print(valor + " ,");

        }

    }

}
