package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

// Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300 y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto), estos deben guardarse en un nuevo array. Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números acabados en 5, podría salir 155, 25, etc.

import java.util.Scanner;

public class Ejercicio8 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        createArrayAndChooseEndingNumber();

    }

    private static void createArrayAndChooseEndingNumber() {

        System.out.println("Which size of array want?. Choose it with a number.");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("the array was saved with the chosen size.");

        int endingNumber;

        do {

            System.out.println("Choose a number between '0' and '9' and you will see the numbers in the array that end in it.");
            endingNumber = sc.nextInt();

        } while (endingNumber < 0 || endingNumber > 9);

        showXnumbers(array, endingNumber);

    }

    private static void showXnumbers(int[] array, int endingNumber) {

        int[] arrayWithEndingNumbers = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) ((Math.random() + 1) * 300);

            if ((array[i] % 10) == endingNumber) {

                int a = 0;
                arrayWithEndingNumbers[a] = array[i];
                System.out.println("This number " + arrayWithEndingNumbers[a] + ", have your ending number.");
                a++;

            }

        }

    }

}
