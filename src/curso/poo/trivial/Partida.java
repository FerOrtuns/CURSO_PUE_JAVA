package curso.poo.trivial;

import java.util.*;

public class Partida {

    private static Scanner sc = new Scanner(System.in);
    private static List<Pregunta> preguntas = new ArrayList<>();
    private static List<Pregunta> preguntasSeleccionadas = new ArrayList<>();
    private static Usuario usuario = new Usuario();

    public static void main(String[] args) {

        mostrarMenu();

    }

    private static void insertarPreguntas() {
        preguntas.add(new Pregunta("El río Amazonas es el más largo del mundo", true, 2));
        preguntas.add(new Pregunta("La Gran Muralla China es visible desde el espacio", false, 5));
        preguntas.add(new Pregunta("El Sol es una estrella", true, 1));
        preguntas.add(new Pregunta("La Mona Lisa fue pintada por Leonardo da Vinci", false, 4));
        preguntas.add(new Pregunta("La Tierra es el planeta más grande del sistema solar", false, 2));
        preguntas.add(new Pregunta("El ser humano puede regenerar extremidades perdidas como los reptiles", false, 1));
        preguntas.add(new Pregunta("La pizza margarita es originaria de Italia", true, 2));
        preguntas.add(new Pregunta("El Monte Everest es la montaña más alta del mundo", true, 2));
        preguntas.add(new Pregunta("Los humanos solo usan el 10% de su cerebro", false, 3));
        preguntas.add(new Pregunta("La capital de Francia es París", true, 1));
    }

    private static void mostrarPregunta() {

        for (int i = 0; i < preguntas.size(); i++) {

            preguntasSeleccionadas.add(preguntas.get(i));
            usuario.responderPregunta(preguntasSeleccionadas.getFirst());
            preguntasSeleccionadas.removeFirst();

        }

        System.out.println("Has finalizado las 10 preguntas.");
    }

    private static void barajarPreguntas() {
        Collections.shuffle(preguntas);
    }

    private static void mostrarMenu() {

        int numeroMenu = 0;

        do {

            System.out.println("\n" + "*** TRIVIAL PURSUIT ***" + "\n" + "Pulsa '1' para jugar. Pulsa '2' para mostrar estadisticas. Pulsa '0' para finalizar el programa.");

            try {

                numeroMenu = Integer.parseInt(sc.nextLine());

                switch (numeroMenu) {

                    case 0:
                        System.out.println("Programa finalizado.");
                        sc.close();
                        break;

                    case 1:
                        usuario.preguntarNombre();
                        insertarPreguntas();
                        barajarPreguntas();
                        mostrarPregunta();
                        pasarPreguntas();
                        break;

                    case 2:
                        usuario.estadisticas();
                        break;

                    default:
                        System.out.println("Error: Numero no valido: " + "\n" + "Pulsa '1' para volver a jugar. Pulsa '0' para finalizar el programa.");
                        break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: Solo puedes introducir carácteres numericos, '0' o '1'. " + e.getMessage());
            }

        } while (numeroMenu != 0);

    }

    private static void pasarPreguntas() {
        int preguntasTotales = preguntas.size();
        usuario.porcentajeDeAciertos(preguntasTotales);
    }

}
