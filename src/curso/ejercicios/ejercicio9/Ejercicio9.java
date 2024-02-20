package curso.ejercicios.ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

// Implementa el juego del ahorcado. La computadora elige una palabra al azar y el usuario tiene que adivinarla ingresando letras.
public class Ejercicio9 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void doll(int intentos) {
        switch (intentos) {
            case 0:
                System.out.println("     ");
                System.out.println("     ");
                System.out.println("     ");
                System.out.println("     ");
                System.out.println("     ");
                System.out.println("     ");
                break;
            case 1:
                System.out.println("     ");
                System.out.println("  O  ");
                System.out.println("     ");
                System.out.println("     ");
                System.out.println("     ");
                System.out.println("     ");
                break;
            case 2:
                System.out.println("     ");
                System.out.println("  O  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("     ");
                System.out.println("     ");
                break;
            case 3:
                System.out.println("     ");
                System.out.println("  O  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" /   ");
                System.out.println("     ");
                break;
            case 4:
                System.out.println("     ");
                System.out.println("  O  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" / | ");
                System.out.println("     ");
                break;
            case 5:
                System.out.println("     ");
                System.out.println("  O  ");
                System.out.println("--|  ");
                System.out.println("  |  ");
                System.out.println(" / | ");
                System.out.println("     ");
                break;
            case 6:
            default:
                System.out.println("     ");
                System.out.println("  O  ");
                System.out.println("--|--");
                System.out.println("  |  ");
                System.out.println(" / | ");
                System.out.println("     ");
                break;
        }
    }

    public static void ingresarPalabra() {

        try {

            System.out.println("¿Que palabra creé que ha ingrasado el ordenador?. Introduzca la palabra para intentar adivinarla.");
            String palabra = sc.next();

        } catch (InputMismatchException e) {

        }

    }

    public static String[] palabrasOrdenador() {
        String[] palabras = {"Adán", "Agustín", "Alberto", "Alejandro", "Alfonso", "Alfredo", "Andrés", "Antonio", "Armando", "Arturo", "Benito", "Benjamín", "Bernardo", "Carlos", "César", "Claudio", "Clemente", "Cristian", "Cristobal", "Daniel", "David", "Diego", "Eduardo", "Emilio", "Enrique", "Ernesto", "Esteban", "Federico", "Felipe", "Fernando", "Francisco", "Gabriel", "Gerardo", "Germán", "Gilberto", "Gonzalo", "Gregorio", "Guillermo", "Gustavo", "Hernán", "Homero", "Horacio", "Hugo", "Ignacio", "Jacobo", "Jaime", "Javier", "Jerónimo", "Jesús", "Joaquín", "Jorge", "Jorge", "Luis", "José", "José", "Eduardo", "José Emilio", "José Luis", "José María", "Juan", "Juan Carlos", "Julio", "Julio César", "Lorenzo", "Lucas", "Luis", "Luis Miguel", "Manuel", "Marco Antonio", "Marcos", "Mariano", "Mario", "Martín", "Mateo", "Miguel", "Miguel Ángel", "Nicolás", "Octavio", "Óscar", "Pablo", "Patricio", "Pedro", "Rafael", "Ramiro", "Ramón", "Raúl", "Ricardo", "Roberto", "Rodrigo", "Rubén", "Salvador", "Samuel", "Sancho", "Santiago", "Sergio", "Teodoro", "Timoteo", "Tomás", "Vicente", "Víctor", "Adela", "Adriana", "Alejandra", "Alicia", "Amalia", "Ana", "Ana Luisa", "Ana María", "Andrea", "Anita", "Ángela", "Antonia", "Ariadna", "Barbara", "Beatriz", "Berta", "Blanca", "Caridad", "Carla", "Carlota", "Carmen", "Carolina", "Catalina", "Cecilia", "Clara", "Claudia", "Concepción", "Conchita", "Cristina", "Daniela", "Débora", "Diana", "Dolores", "Lola", "Dorotea", "Elena", "Elisa", "Eloisa", "Elsa", "Elvira", "Emilia", "Esperanza", "Estela", "Ester", "Eva", "Florencia", "Francisca", "Gabriela", "Gloria", "Graciela", "Guadalupe"};

        return palabras;
    }
}
