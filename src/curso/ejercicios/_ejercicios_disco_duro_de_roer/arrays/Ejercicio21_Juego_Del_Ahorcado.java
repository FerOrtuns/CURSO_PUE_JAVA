package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

/*
Vamos a crear el juego del ahorcado por consola. Al inicio del programa, pedirá los nombres de los dos jugadores. El primer turno será para el jugador 1. Uno escribe una palabra y el otro la adivina, si este la adivina obtendrá un punto y escribirá una palabra, sino lo acierta el jugador actual suma un punto y escribe de nuevo otra palabra. Cuando el jugador inserte su palabra también deberá añadir una pequeña pista, por ejemplo si la palabra es Madrid, la pista puede ser «Ciudad». El jugador que tenga que acertar la palabra tendrá seis oportunidades (cabeza, cuerpo, brazos y piernas). No es necesario dibujar nada por pantalla, solo mostrar el número de oportunidades restantes. Deberá mostrase los caracteres que el usuario inserta para esa palabra, para evitar que las repita, en caso de que lo haga, avisarle y no contar como error. Cada vez que acierte o no la palabra, deberá mostrar la puntuación de ambos. El primero que llegue a 3 puntos gana. Puedes usar todos los medios a tu alcance.
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio21_Juego_Del_Ahorcado {

    private static Scanner sc = new Scanner(System.in);
    private static String nombreJugador[] = {"", ""};
    private static String palabra = "";
    private static String pista = "";
    private static char[] caracteresDeLaPalabraOcultos;
    private static int[] puntuacionJugadores = new int[2];

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {

        int numeroMenu = -1;
        boolean flag = false;

        do {

            System.out.println("\n\n" + "*** JUEGO DEL AHORCADO ***");
            System.out.println("Pulsa 1 para jugar. Pulsa 0 para terminar.");

            try {

                numeroMenu = sc.nextInt();

                switch (numeroMenu) {

                    case 1:
                        jugar();
                        break;
                    case 0:
                        flag = true;
                        break;
                    default:
                        System.out.println("Has introducido un numero incorrecto.");

                }

            } catch (InputMismatchException e) {
                System.out.println("Solo puedes introducir numeros.");
                sc.nextLine();
            }

        } while (!flag);

        System.out.println("Programa Finalizado.");

    }

    private static void jugar() {

        sc.nextLine();

        System.out.println("Introduce el nombre del primer jugador:");
        int numeroJugadorUno = 0;
        pedirNombreJugador(numeroJugadorUno);

        System.out.println("Introduce el nombre del segundo jugador:");
        int numeroJugadorDos = 1;
        pedirNombreJugador(numeroJugadorDos);

        while (puntuacionJugadores[0] != 3 || puntuacionJugadores[1] != 3) {
            insertarPalabra(numeroJugadorUno);
            insertarPalabra(numeroJugadorDos);
        }

    }

    private static void pedirNombreJugador(int numeroJugador) {

        boolean flag = false;

        do {

            nombreJugador[numeroJugador] = sc.nextLine();

            if (!nombreJugador[numeroJugador].matches("^[\\p{L}'-]{3,30}(?:[\\s.]+[\\p{L}'-]{3,30})*$")) {
                System.out.println("El nombre debe tener entre 3 y 30 letras. Tampoco puedes introducir numeros caracteres numericos, ni especiales.");
            } else {
                System.out.println("¡Hola " + nombreJugador[numeroJugador] + "!. ¡Vamos a jugar!" + "\n");
                flag = true;
            }

        } while (!flag);

    }

    private static void insertarPalabra(int numeroJugador) {

        System.out.println("¡" + nombreJugador[numeroJugador] + "! Introduce una palabra para que el otro jugador intente adivinarla.");
        boolean flag = false;
        char[] caracteresDeLaPalabra;

        do {

            palabra = sc.next();
            caracteresDeLaPalabra = new char[palabra.length()];

            if (!palabra.matches("^[\\p{L}'-]{3,30}(?:[\\s.]+[\\p{L}'-]{3,30})*$")) {
                System.out.println("No puedes introducir una palabra que tenga menos de 3 letras, ni caracteres numericos, ni especiales.");
            } else {

                for (int i = 0; i < palabra.length(); i++) {

                    caracteresDeLaPalabra[i] = palabra.charAt(i);

                }

                flag = true;
                sc.nextLine();

            }

        } while (!flag);

        insertarPista(numeroJugador);

        if (numeroJugador == 0) {
            adivinarPalabra(1, caracteresDeLaPalabra);

        } else if (numeroJugador == 1) {
            adivinarPalabra(0, caracteresDeLaPalabra);

        }

    }

    private static void insertarPista(int numeroJugador) {

        System.out.println("¡" + nombreJugador[numeroJugador] + "! Ayuda a tu contrincante dandole una pista.");
        boolean flag = false;

        do {

            pista = sc.nextLine();

            if (!pista.matches("^[\\p{L}'-]{2,30}(?:[\\s.]+[\\p{L}'-]{2,30})*$")) {

                System.out.println("No puede contener simbolos, numeros, ni caracteres especiales.");

            } else {

                System.out.println("La pista que introduciste fue: '" + pista + "'." + "\n");
                flag = true;

            }

        } while (!flag);

    }

    private static void adivinarPalabra(int numeroJugador, char[] caracteresDeLaPalabra) {

        System.out.println("¡" + nombreJugador[numeroJugador] + "! ¡Intenta adivinar la palabra!.");

        int intentos = 6;
        caracteresDeLaPalabraOcultos = new char[caracteresDeLaPalabra.length];

        for (int i = 0; i < caracteresDeLaPalabra.length; i++) {

            caracteresDeLaPalabraOcultos[i] = '_';
            System.out.print(caracteresDeLaPalabraOcultos[i]);

        }

        do {

            int escaneoPalabraCompleta = 0;
            System.out.println("\n" + "Introduce una letra:");
            String letra = sc.next();

            if (letra.length() == 1) {

                for (int i = 0; i < caracteresDeLaPalabra.length; i++) {

                    if (caracteresDeLaPalabra[i] == letra.charAt(0)) {

                        caracteresDeLaPalabraOcultos[i] = letra.charAt(0);

                    } else if (caracteresDeLaPalabra[i] != letra.charAt(0)) {

                        escaneoPalabraCompleta++;

                        if (escaneoPalabraCompleta == caracteresDeLaPalabra.length) {

                            intentos--;
                            System.out.println("Te quedan " + intentos + " intentos.");

                        }

                    }

                }

                for (int i = 0; i < caracteresDeLaPalabraOcultos.length; i++) {

                    System.out.print(caracteresDeLaPalabraOcultos[i]);

                }

            }

            if (Arrays.equals(caracteresDeLaPalabra, caracteresDeLaPalabraOcultos)) {
                System.out.println("\n" + "¡Has adivinado la palabra!");
                incrementarPuntosJugador(numeroJugador);
                break;
            }

        } while (intentos != 0);

        if (intentos == 0) {
            System.out.println("\n" + "Has perdido esta ronda, no ganas ningun punto." + "\n\n");
        }

    }

    private static void incrementarPuntosJugador(int numeroJugador) {

        puntuacionJugadores[numeroJugador] += 1;
        System.out.println("¡Enhorabuena " + nombreJugador[numeroJugador] + "! Has ganado 1 punto!. Tienes un total de: " + puntuacionJugadores[numeroJugador] + " puntos.");

        if (puntuacionJugadores[numeroJugador] >= 3) {
            System.out.println("¡¡" + nombreJugador[numeroJugador] + "!! " + "¡¡HAS GANADO LA PARTIDA!!");
            System.out.println("El juego ha finalizado!");
            System.exit(0);
        }

    }

}
