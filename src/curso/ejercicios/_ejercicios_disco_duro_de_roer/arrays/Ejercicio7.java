package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

/*Crea dos arrays de números con una posición pasado por teclado. Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior, después crea un nuevo array con el primer array (usa de nuevo new con el primer array) con el mismo tamaño que se ha pasado por teclado, rellenalo de nuevo con números aleatorios. Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente. Por último, muestra el contenido de cada array. Llama al final al recolector de basura.*/

import java.util.Scanner;

public class Ejercicio7 {

    private static Scanner sc = new Scanner(System.in);
    private static int[] arrayOne;
    private static int[] arrayTwo;

    public static void main(String[] args) {

        fillArray();

    }

    private static void fillArray() {

        System.out.println("Which size of array want?. Choose it with a number.");
        int size = sc.nextInt();
        arrayOne = new int[size];

        for (int i = 0; i < arrayOne.length; i++) {

            arrayOne[i] = (int) ((Math.random() + 1) * 100);

        }

        arrayTwo = arrayOne;
        arrayOne = new int[size];

        for (int i = 0; i < arrayOne.length; i++) {

            arrayOne[i] = (int) ((Math.random() + 1) * 100);

        }

        arraysMultiplicationAndShow(arrayOne, arrayTwo);

    }

    private static void arraysMultiplicationAndShow(int[] arrayOne, int[] arrayTwo) {

        int[] arrayThree = new int[arrayOne.length];

        for (int i = 0; i < arrayThree.length; i++) {

            arrayThree[i] = arrayOne[i] * arrayTwo[i];

        }

        System.out.print("ArrayOne content: ");

        for (int i = 0; i < arrayThree.length; i++) {

            System.out.print(arrayOne[i] + ", ");

        }

        System.out.print("\n" + "ArrayTwo content: ");

        for (int i : arrayTwo) {

            System.out.print(i + ", ");

        }

        System.out.print("\n" + "ArrayThree content: ");

        for (int i = 0; i < arrayThree.length; i++) {

            System.out.print(arrayThree[i] + ", ");

        }

        System.gc();

    }

}
