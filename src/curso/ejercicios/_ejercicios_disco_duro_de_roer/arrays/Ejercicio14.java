package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

//Crear dos arrays, rellenar uno con números y copiarlo al otro usando CopyOf de Arrays.

import java.util.Arrays;
import java.util.Random;

public class Ejercicio14 {

    private static Random random = new Random();

    public static void main(String[] args) {

        int[] a = new int[10];

        System.out.print("Array a: ");

        for (int i = 0; i < a.length; i++) {

            a[i] = random.nextInt(100);
            System.out.print(a[i] + ", ");

        }

        int[] b = Arrays.copyOf(a, a.length);

        System.out.println("\n" + "Array b:" + Arrays.toString(b));

    }

}
