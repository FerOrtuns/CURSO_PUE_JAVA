package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

//Rellenar un array de numeros (int) usando el metodo fill de Arrays.

import java.util.Arrays;
import java.util.Random;

public class Ejercicio13 {

    private static Random random = new Random();

    public static void main(String[] args) {

        int[] number = new int[50];


        for (int i = 0; i < number.length; i++) {

            Arrays.fill(number, random.nextInt(1000));
            System.out.print(number[i] + "\t");

        }


    }

}
