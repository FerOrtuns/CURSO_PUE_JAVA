package curso.ejercicios.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

// Desarrolla un programa que convierta la temperatura de Celsius a Fahrenheit y viceversa. Permite al usuario elegir la dirección de la conversión.
public class Ejercicio3 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numeroMenu;

        do {

            System.out.println("Pulsa '1' para convertir grados Celsius a grados Fahrenheit, '2' para convertir Fahrenheit a Celsius, '0' para salir del programa.");
            numeroMenu = sc.nextInt();

            switch (numeroMenu) {

                case 1:

                    double celsius = pedirCelsius();
                    mostrarResultadoFahrenheit(celsius);
                    break;

                case 2:

                    double fahrenheit = pedirFahrenheit();
                    mostrarResultadoCelsius(fahrenheit);
                    break;

                case 0:

                    break;

            }

        } while (numeroMenu != 0);

        System.out.println("Programa Finalizado.");

    }

    private static double pedirCelsius() {

        double celsius = 0;
        boolean flag = false;

        do {

            try {

                System.out.println("Introduce la cantidad de grados Celsius:");
                celsius = sc.nextDouble();
                flag = true;

            } catch (InputMismatchException e) {

                System.out.println("Error: Introduce un numero valido.");
                sc.next();

            }

        } while (!flag);

        return celsius;

    }

    private static double pedirFahrenheit() {

        double fahrenheit = 0;
        boolean flag = false;

        do {

            try {

                System.out.println("Introduce la cantidad de grados Fahrenheit:");
                fahrenheit = sc.nextDouble();
                flag = true;

            } catch (InputMismatchException e) {

                System.out.println("Error: Introduce un numero valido.");
                sc.next();

            }

        } while (!flag);

        return fahrenheit;

    }

    private static void mostrarResultadoFahrenheit(double celsius) {

        double fahrenheit = celsiusAfahrenheit(celsius);
        System.out.println(celsius + " grados Celsius equivalen a: " + fahrenheit + " grados Fahrenheit.");

    }

    private static void mostrarResultadoCelsius(double fahrenheit) {

        double celsius = fahrenheitAcelsius(fahrenheit);
        System.out.println(fahrenheit + " grados celsius equivalen a: " + celsius + " grados Fahrenheit.");

    }

    // FORMULA: Grados Fahrenheit = (Grados Celsius × (9 / 5) + 32
    private static double celsiusAfahrenheit(double celsius) {
        return (celsius * (9.0 / 5)) + 32;
    }

    // FORMULA: Grados Celsius = (Grados Fahrenheit - 32) x 5 / 9
    private static double fahrenheitAcelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
