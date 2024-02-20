package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

//Indica si dos arrays creados por ti son iguales con Equals de Arrays.

import java.util.Arrays;

public class Ejercicio15 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.equals(a, b)); // TRUE

        int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 999};
        int[] bb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.equals(aa, bb)); // FALSE

        int[] aaa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] bbb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.equals(aaa, bbb)); // FALSE

    }

}
