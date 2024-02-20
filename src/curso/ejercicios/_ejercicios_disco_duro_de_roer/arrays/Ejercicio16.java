package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

// Ordena un array de números con Sort de Arrays.

import java.util.Arrays;

public class Ejercicio16 {

    public static void main(String[] args) {

        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(a);

        for (int value : a) {

            System.out.print(value);

        }

    }

}
