package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

/*
Se quiere simular un juego en el que participan N jugadores y otra persona que hace de árbitro. Cada jugador elige 4 números en el rango [1, 10], pudiendo estar repetidos. A continuación, el árbitro, sin conocer los números que ha elegido cada jugador, selecciona 2 números A y B. El programa debe ser capaz de calcular cuántos números de los seleccionados por cada jugador están comprendidos entre los valores A y B. Ganará el jugador que más números tenga en dicho intervalo. Se pide implementar un programa modular que simule el juego para 3 jugadores, teniendo en cuenta que:
Tanto los 4 datos de cada jugador, como los valores para A y B se introducirán por teclado. En todos los casos, el programa detectará la entrada de números erróneos, solicitando nuevamente el dato hasta que sea válido.
Se deben mostrar por pantalla no solo los aciertos de cada jugador sino los datos que ha introducido cada jugador y los que ha seleccionado el árbitro. Por último, hay que imprimir la media aritmética de los aciertos de todos los jugadores
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio24 {

    private static Scanner sc = new Scanner(System.in);
    private static int numeroDeJugadores = 2;
    private static int numerosElegidos = 4;
    private static String[] nombresDeLosJugadores = new String[numeroDeJugadores];
    private static Map<String, Integer> numerosDeLosJugadores = new HashMap<>();


    public static void main(String[] args) {
        pedirNombreJugador();
        pedirNombreArbitro();
    }

    private static void pedirNombreJugador() {

        boolean flag = false;

        do {

            for (int i = 0, a = 0; i < nombresDeLosJugadores.length; i++) {

                System.out.println("\n\n" + "Introduce el nombre del jugador:");
                nombresDeLosJugadores[i] = sc.nextLine();

                if (!nombresDeLosJugadores[i].matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s'´]{3,}$")) {

                    System.out.println("No puedes introducir caracteres numericos, ni especiales, ni de menos de 3 caracteres.");
                    i--;

                } else if (nombresDeLosJugadores[i].matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s'´]{3,}$")) {

                    System.out.println("¡Hola " + nombresDeLosJugadores[i] + "!");
                    a++;
                    pedirNumerosJugadores(nombresDeLosJugadores[i]);

                    if (a == nombresDeLosJugadores.length) {
                        flag = true;
                    }

                }

            }

        } while (!flag);

    }

    private static void pedirNombreArbitro() {

        boolean flag = false;
        String nombreArbitro;

        do {

            System.out.println("\n\n" + "Introduce el nombre del arbitro:");
            nombreArbitro = sc.nextLine();

            if (!nombreArbitro.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s'´]{3,}$")) {

                System.out.println("No puedes introducir caracteres numericos, ni especiales, ni de menos de 3 caracteres.");

            } else if (nombreArbitro.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s'´]{3,}$")) {

                System.out.println("¡Hola " + nombreArbitro + "!");
                flag = true;

            }

        } while (!flag);

    }

    private static void numerosEntreAyB() {


    }

    private static void pedirNumerosJugadores(String nombre) {

        int[] numeros = new int[numerosElegidos];
        boolean flag = false;

        do {

            for (int i = 0; i < 4; i++) {

                System.out.print("\n" + "introduce un numero: ");
                numeros[i] = sc.nextInt();

                if (numeros[i] < 0 || numeros[i] > 10) {

                    System.out.println("No puedes introducir caracteres no numericos menores a 0 ni mayores a 10.");
                    i--;

                } else if (numeros[i] >= 0 || numeros[i] <= 10) {

                    if (i == 3) {

                        System.out.print("Los numeros que has introducido fueron: ");
                        for (int numero : numeros) {
                            System.out.print(numero);
                        }

                        sc.nextLine();
                        flag = true;

                    }

                }

            }

        } while (!flag);

        guardarNumeros(numeros, nombre);

    }

    private static void guardarNumeros(int[] numeros, String nombre) {

        int numero = 0;

        for (int i = 0; i < numerosElegidos; i++) {

        }


    }

}
