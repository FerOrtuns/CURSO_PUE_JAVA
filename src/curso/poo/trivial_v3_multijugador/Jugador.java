package curso.poo.trivial_v3_multijugador;

import java.util.Scanner;

public class Jugador implements Comparable<Jugador> {

    private static Scanner sc = new Scanner(System.in);
    private static int puntuacion = 0;
    private static int totalRespuestasAcertadas = 0;
    private static double porcentaje = 0.0;
    private static String[] nombre = new String[2];

    public void preguntarNombre() {

        boolean flag = false;
        int numeroJugadores = 0;

        do {

            try {

                System.out.println("Pulsa '1', para jugar a 1 player. Pulsa '2' para jugar a 2 player.");
                numeroJugadores = sc.nextInt();

                sc.nextLine();

                if (numeroJugadores == 1) {

                    System.out.println("Introduce tu nombre:");
                    nombre[0] = sc.nextLine();

                    if (!nombre[0].matches("^[\\p{L}'-]{3,30}(?:[\\s.]+[\\p{L}'-]{3,30})*$")) {
                        throw new IllegalArgumentException("El nombre debe tener entre 3 y 30 letras.");
                    }

                    System.out.println("¡Hola " + nombre[0] + "!. ¡Vamos a jugar!" + "\n");
                    flag = true;

                } else if (numeroJugadores == 2) {

                    for (int i = 0; i < 2; i++) {

                        System.out.println("Introduce tu nombre:");
                        nombre[i] = sc.nextLine();

                        if (!nombre[i].matches("^[\\p{L}'-]{3,30}(?:[\\s.]+[\\p{L}'-]{3,30})*$")) {
                            throw new IllegalArgumentException("El nombre debe tener entre 3 y 30 letras.");
                        }

                        System.out.println("¡Hola " + nombre[i] + "!. ¡Vamos a jugar!" + "\n");

                    }

                    flag = true;

                } else {
                    System.out.println("Solo puedes introducir un '1' o un '2'.");
                }


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

    @Override
    public int compareTo(Jugador o) {
        return Integer.compare(this.puntuacion, o.puntuacion);
    }

}
