package curso.ejercicios.extra2;

public class EstadisticasArrayNumeros {

    public static void main(String[] args) {

        int[] array = {5, 8, 65, 2, 47, 23};
        int totalFor = 0;
        int totalForEach = 0;

        for (int i = 0; i < array.length; i++) {

            totalFor += array[i];

        }

        for (int numerosDelArray : array) {

            totalForEach += numerosDelArray;

        }

        System.out.println("La suma de los numeros del array en el bucle for es: " + totalFor);
        System.out.println("La suma de los numeros del array en el bucle forEach es: " + totalForEach);

    }

}
