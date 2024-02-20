package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

// Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los valores. Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar), para mostrar el contenido y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();
    private static int[] array;
    private static int sum;

    public static void main(String[] args) {

        createArrayAndSize();
        fillArrayWithRandomNumbers();
        showArrayNumbersAndSum();

    }

    private static void createArrayAndSize() {

        System.out.println("Enter a number for choose the array size.");
        int size = sc.nextInt();
        array = new int[size];

    }

    private static void fillArrayWithRandomNumbers() {

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(10);

        }

    }

    private static void showArrayNumbersAndSum() {

        for (int valor : array) {

            System.out.print(valor + " ,");
            sum += valor;

        }

        System.out.println("The sum of numbers are: " + sum);

    }

}
