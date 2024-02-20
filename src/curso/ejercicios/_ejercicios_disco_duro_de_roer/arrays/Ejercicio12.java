package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

/*
Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5}, guardar los valores de este array en otro array distinto pero con los valores invertidos, es decir, que el segundo array debera tener los valores {5,4,3,2,1}.
 */

public class Ejercicio12 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        int subtract = a.length - 1;

        for (int i = 0; i < a.length; i++) {

            b[subtract] = a[i];
            subtract--;

        }

        for (int valor : b) {

            System.out.print(valor + ", ");
        }


    }


}
