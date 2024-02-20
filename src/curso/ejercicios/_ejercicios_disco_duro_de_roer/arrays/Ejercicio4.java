package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

// Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.

public class Ejercicio4 {

    public static void main(String[] args) {

        function();

    }

    private static void function() {

        int[] array = new int[101];
        int totalSum = 0;

        System.out.print("The array numbers are: ");

        for (int i = 1; i < array.length; i++) {

            array[i] = i;
            totalSum += array[i];
            System.out.print(array[i] + ", ");

        }

        System.out.println("The sum of all numbers are: " + totalSum);

    }

}
