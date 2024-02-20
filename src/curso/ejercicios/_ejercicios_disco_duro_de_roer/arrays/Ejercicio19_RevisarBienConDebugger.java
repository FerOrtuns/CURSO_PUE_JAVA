package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

// Ordenar un array de cadenas con el método Quicksort.

import java.util.Arrays;

public class Ejercicio19_RevisarBienConDebugger {
    public static void main(String[] args) {

        String[] arrayNombres = {"Leon", "Chris", "Jill", "Wesker", "Ada"};
        System.out.println("Antes de QS: " + Arrays.toString(arrayNombres));

        quicksort(arrayNombres, 0, arrayNombres.length - 1);
        System.out.println("Después de QS: " + Arrays.toString(arrayNombres));

    }

    // Divide y vencerás
    private static void quicksort(String[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(array, izquierda, derecha);
            quicksort(array, izquierda, indiceParticion);
            quicksort(array, indiceParticion + 1, derecha);
        }
    }

    private static int particion(String[] array, int izquierda, int derecha) {
        // Elegimos el pivote, es el primero
        String pivote = array[izquierda];
        // Ciclo infinito
        while (true) {
            // Mientras cada elemento desde la izquierda esté en orden (sea menor que el
            // pivote) continúa avanzando el índice
            while (array[izquierda].compareTo(pivote) < 0) {
                izquierda++;
            }
            // Mientras cada elemento desde la derecha esté en orden (sea mayor que el
            // pivote) continúa disminuyendo el índice
            while (array[derecha].compareTo(pivote) > 0) {
                derecha--;
            }
    /*
    Si la izquierda es mayor o igual que la derecha significa que no
    necesitamos hacer ningún intercambio
    de variables, pues los elementos ya están en orden (al menos en esta
    iteración)
    */
            if (izquierda >= derecha) {
                // Indicar "en dónde nos quedamos" para poder dividir el array de nuevo
                // y ordenar los demás elementos
                return derecha;
            } else {//Nota: yo sé que el else no hace falta por el return de arriba, pero así el algoritmo es más claro
      /*
      Si las variables quedaron "lejos" (es decir, la izquierda no superó ni
      alcanzó a la derecha)
      significa que se detuvieron porque encontraron un valor que no estaba
      en orden, así que lo intercambiamos
      */
                String temporal = array[izquierda];
                array[izquierda] = array[derecha];
                array[derecha] = temporal;
      /*
      Ya intercambiamos, pero seguimos avanzando los índices una vez más
      */
                izquierda++;
                derecha--;
            }
            // El while se repite hasta que izquierda >= derecha
        }
    }

    private static int particion(int array[], int izquierda, int derecha) {

        // Elegimos el pivote, es el primero
        int pivote = array[izquierda];
        // Ciclo infinito
        while (true) {
            // Mientras cada elemento desde la izquierda esté en orden (sea menor que el
            // pivote) continúa avanzando el índice
            while (array[izquierda] < pivote) {
                izquierda++;
            }
            // Mientras cada elemento desde la derecha esté en orden (sea mayor que el
            // pivote) continúa disminuyendo el índice
            while (array[derecha] > pivote) {
                derecha--;
            }
    /*
    Si la izquierda es mayor o igual que la derecha significa que no
    necesitamos hacer ningún intercambio
    de variables, pues los elementos ya están en orden (al menos en esta
    iteración)
    */
            if (izquierda >= derecha) {
                // Indicar "en dónde nos quedamos" para poder dividir el array de nuevo
                // y ordenar los demás elementos
                return derecha;
            } else {//Nota: yo sé que el else no hace falta por el return de arriba, pero así el algoritmo es más claro
      /*
      Si las variables quedaron "lejos" (es decir, la izquierda no superó ni
      alcanzó a la derecha)
      significa que se detuvieron porque encontraron un valor que no estaba
      en orden, así que lo intercambiamos
      */
                int temporal = array[izquierda];
                array[izquierda] = array[derecha];
                array[derecha] = temporal;
      /*
      Ya intercambiamos, pero seguimos avanzando los índices una vez más
      */
                izquierda++;
                derecha--;
            }
            // El while se repite hasta que izquierda >= derecha
        }
    }


    // Divide y vencerás
    private static void quicksort(int[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(array, izquierda, derecha);
            quicksort(array, izquierda, indiceParticion);
            quicksort(array, indiceParticion + 1, derecha);
        }
    }

}