package curso.poo.trivial_v1_funcionalidades_extra;

import java.util.*;

import static java.util.stream.IntStream.rangeClosed;

public class Partida {

    private static List<Pregunta> preguntas = new ArrayList<>();
    private static List<Pregunta> preguntasSeleccionadas = new ArrayList<>();
    private static Usuario usuario = new Usuario();

    public static void main(String[] args) {

        mostrarMenu();

    }

    private static void mostrarMenu() {

        Scanner sc = new Scanner(System.in);
        int numeroMenu = -1;

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
                        //ordenarPreguntasPorDificultadCompareTo();
                        //ordenarPreguntasPorDificultadTradicional();
                        //ordenarPreguntasPorDificultadFuncional();
                        barajarPreguntas();
                        mostrarPregunta();
                        pasarPreguntas();
                        break;

                    case 2:
                        usuario.estadisticas();
                        break;

                    default:
                        System.out.println("Error: Numero no valido.");

                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Solo puedes introducir carácteres numericos, '0' o '1'. " + e.getMessage());
            }

        } while (numeroMenu != 0);
    }

    public static void insertarPreguntas() {
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

        for (Pregunta pregunta : preguntas) {

            preguntasSeleccionadas.add(pregunta);
            usuario.responderPregunta(preguntasSeleccionadas.getFirst());
            preguntasSeleccionadas.removeFirst();

        }

        System.out.println("Has finalizado las 10 preguntas.");
    }

    private static void barajarPreguntas() {
        Collections.shuffle(preguntas);
    }

    private static void ordenarPreguntasPorDificultadCompareTo() {

        Collections.sort(preguntas);

        for (Pregunta pregunta : preguntas) {

            System.out.println(pregunta);

        }

    }

    private static void ordenarPreguntasPorDificultadTradicional() {

        List<Pregunta> preguntasOrdenadasPorDificultad = new ArrayList<>();
        int dificultadMaxima = 5;

        for (int i = 0; i <= dificultadMaxima; i++) {
            for (Pregunta pregunta : preguntas) {
                if (pregunta.getDificultad() == i) {
                    preguntasOrdenadasPorDificultad.add(pregunta);
                }
            }
        }

        for (Pregunta pregunta : preguntasOrdenadasPorDificultad) {
            System.out.println(pregunta);
        }

    }

    private static void ordenarPreguntasPorDificultadFuncional() {

        int dificultadMaxima = 5;

        List<Pregunta> preguntasOrdenadasPorDificultad =
                rangeClosed(0, dificultadMaxima)
                        .boxed()
                        .flatMap(dificultad -> preguntas.stream().filter(p -> p.getDificultad() == dificultad))
                        .toList();

        preguntasOrdenadasPorDificultad.forEach(System.out::println);

    }

    private static void pasarPreguntas() {
        int preguntasTotales = preguntas.size();
        usuario.porcentajeDeAciertos(preguntasTotales);
    }

}
