package curso.poo.trivial;

import java.util.Scanner;

public class Usuario {

    private static Scanner sc = new Scanner(System.in);
    private static int puntuacion = 0;
    private static int totalRespuestasAcertadas = 0;
    private static double porcentaje = 0.0;

    public void preguntarNombre() {

        String nombre = "";
        boolean flag = false;

        do {

            try {

                System.out.println("Introduce tu nombre:");
                nombre = sc.nextLine();

                if (!nombre.matches("^[\\p{L} .'-]+$")) {
                    throw new IllegalArgumentException("El nombre debe contener solo letras y espacios.");
                }

                System.out.println("¡Hola " + nombre + "!. ¡Vamos a jugar!" + "\n");
                flag = true;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (!flag);

    }

    public void responderPregunta(Pregunta pregunta) {

        int respuesta = 0;

        do {

            System.out.println("¿Es cierta esta afirmación?. " + "\t" + "Pulsa '1' para Afirmar. Pulsa '2' para negar.");
            System.out.println(pregunta.getAfirmacion());

            try {

                respuesta = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Error: Solo puedes introducir carácteres numericos, '1' o '2'. " + e.getMessage());
            }

            if (respuesta == 1 && pregunta.esCorrecto() || respuesta == 2 && !pregunta.esCorrecto()) {

                incrementarPuntuacion(pregunta.getDificultad());
                totalRespuestasAcertadas++;
                System.out.println("¡¡ACERTASTE!!" + "\n" + "¡¡Has ganado " + pregunta.getDificultad() + " puntos!!");

            } else if (respuesta != 1 && respuesta != 2) {

                System.out.println("Solo puedes introducir un '1' o un '2'.");

            } else {

                System.out.println("¡No has acertado la pregunta!" + "\n\n\n");

            }

        } while (respuesta != 1 && respuesta != 2);

    }

    public void estadisticas() {
        System.out.println("Has acertado un total de " + totalRespuestasAcertadas + " respuestas.");
        System.out.println("Tu puntuacion total es de: " + puntuacion + " puntos.");
        System.out.println("Has acertado un '" + porcentaje + "%' del total de las preguntas.");
    }

    public int incrementarPuntuacion(int puntuacion) {
        return this.puntuacion += puntuacion;
    }

    public double porcentajeDeAciertos(int preguntasTotales) {
        return porcentaje = ((double) totalRespuestasAcertadas / preguntasTotales) * 100;
    }

}
