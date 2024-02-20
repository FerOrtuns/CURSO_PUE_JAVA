package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres. Puedes hacer con o sin métodos de String.

import java.util.Scanner;

public class Ejercicio6 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        askForPhrase();
    }

    private static void askForPhrase() {

        System.out.println("Enter a sentence");
        String phrase = sc.nextLine();
        passCharactersToArray(phrase);

    }

    private static void passCharactersToArray(String phrase) {

        char[] characters = new char[phrase.length()];

        for (int i = 0; i < phrase.length(); i++) {

            characters[i] = phrase.charAt(i);

        }

        for (char character : characters) {

            System.out.print(character + " ,");

        }

    }

}
