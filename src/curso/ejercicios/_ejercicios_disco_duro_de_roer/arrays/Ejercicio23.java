package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

/*
 Teniendo un vector con los valores que queramos, meter en otro de la misma longitud, aquellos que sean pares y mayores que 25.
 Después, mostrar el vector de origen y el de destino, solo los numero introducidos.
 */

import java.util.Random;

public class Ejercicio23 {

    private static Random random = new Random();
    private static int[] arrayA = {114, 78, 23, 187, 34, 160, 51, 141, 69, 37, 95, 82, 120, 176, 57, 45, 3, 92, 127, 110, 77,
            14, 8, 18, 194, 98, 30, 115, 68, 6, 19, 63, 184, 163, 199, 32, 126, 196, 93, 54, 123, 84, 21, 101, 158, 97, 173, 9, 53};
    private static int[] arrayB = new int[50];
    private static int[] arrayARandom = new int[50];

    public static void main(String[] args) {

//        usandoArrayA();
        usandoArrayRandom();

    }

    private static void usandoArrayA() {

        for (int i = 0, a = 0; i < arrayA.length && a < arrayB.length; i++) {

            if (arrayA[i] % 2 == 0 && arrayA[i] > 25) {

                arrayB[a] = arrayA[i];
                a++;

            }

        }

        System.out.print("ArrayA, aqui estan los 50 numeros introducidos --> \t");
        for (int valor : arrayA) {
            System.out.print(valor + ", ");
        }

        System.out.print("\n\n" + "ArrayB, aqui los numeros estan filtrados --> \t");
        for (int valor : arrayB) {
            System.out.print(valor + ", ");
        }

    }

    private static void usandoArrayRandom() {

        for (int i = 0, a = 0; i < arrayARandom.length && a < arrayB.length; i++) {

            arrayARandom[i] = random.nextInt(500);

            if (arrayARandom[i] > 25 && arrayARandom[i] % 2 == 0) {

                arrayB[a] = arrayARandom[i];
                a++;
            }

        }

        System.out.print("ArrayARandom, aqui introducimos numeros aleatorios --> \t");
        for (int valor : arrayARandom) {
            System.out.print(valor + ", ");
        }

        System.out.print("\n\n" + "ArrayB, aqui los numeros estan filtrados --> \t");
        for (int valor : arrayB) {
            System.out.print(valor + ", ");
        }

    }

}
