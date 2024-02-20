package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

// Generar un arreglo con numero aleatorios no repetidos entre sí.

import java.util.Random;

public class Ejercicio22 {

    private static Random random = new Random();

    public static void main(String[] args) {
        generarArrayAleatorio();
    }

    // No solucionado, falta que no se repitan.
    private static void generarArrayAleatorio() {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {

            int numeroAleatorio = random.nextInt(100);

            if (array[i] != numeroAleatorio) {
                array[i] = numeroAleatorio;
            }
            System.out.print(array[i] + ", ");
        }


    }

}
