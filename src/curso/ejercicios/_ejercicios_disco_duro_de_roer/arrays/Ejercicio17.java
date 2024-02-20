package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

// Ordenar un array de números con el método de la burbuja.

public class Ejercicio17 {

    private static int[] array = {5, 18, 42, 9, 31, 77, 14, 23, 8, 55, 62, 3, 27, 47, 13, 36, 69, 11, 44, 20};


    public static void main(String[] args) {

        sortByBubbleMethod();
        printArray();

    }

    // Hice el 90% de este metodo yo solo, me ayude de chatgpt al final, por lo tanto tratar de practicarlo de nuevo con Ejercicio17_v1
    private static void sortByBubbleMethod() {

        int lenght = array.length;

        for (int i = 0; i < lenght - 1; i++) {

            for (int j = 0; j < lenght - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;

                }

            }

        }

    }

    private static void printArray() {

        for (int value : array) {
            System.out.print(value + ", ");
        }

    }

}
