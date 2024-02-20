package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

// Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta, se añadira a una cadena que se mostrara al final, se dejará de insertar cuando se introduzca un -1.
//Por ejemplo, si escribo los siguientes numeros
//0 //Añadira la ‘A’
//5 //Añadira la ‘F’
//25 //Añadira la ‘Z’
//50 //Error, inserte otro numero
//-1 //fin
//Cadena resultante: AFZ

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        alphabetArray();

    }

    private static void alphabetArray() {

        List<Character> letterList = new ArrayList<>();
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int value;
        boolean flag = false;

        do {

            System.out.println("¿Which letter of the alphabet do you want?. Say it with a number (0 to 26). Press '-1' to end.");
            value = sc.nextInt();

            if (value >= 0 && value < alphabet.length) {

                letterList.add(alphabet[value]);

            } else if (value == -1) {

                flag = true;

            } else {
                System.out.println("Only numbers from 1 to 27");
            }

        } while (!flag);

        System.out.print("Result: ");
        for (char letter : letterList) {
            System.out.print(letter);
        }

        System.out.println("Program ends.");

    }

}
