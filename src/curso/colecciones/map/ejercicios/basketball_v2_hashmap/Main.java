package curso.colecciones.map.ejercicios.basketball_v2_hashmap;

import java.time.LocalDate;
import java.util.*;

public class Main {

    private static List<JugadorBaloncesto> jugadores = new ArrayList<>();
    private static Map<Posicion, List<JugadorBaloncesto>> mapJugadoresPosicion = new HashMap<>();

    public static void main(String[] args) {
//        inicializarHashmap();
        insertarJugadores();
        clasificarJugadoresPorPosicion(jugadores);
    }

    public static void insertarJugadores() {
        jugadores.add(new JugadorBaloncesto("Carla", "Rodriguez", 150, 75, LocalDate.of(1995, 3, 15), 50, Posicion.BASE));
        jugadores.add(new JugadorBaloncesto("Juan", "Gomez", 120, 90, LocalDate.of(1996, 6, 20), 40, Posicion.ESCOLTA));
        jugadores.add(new JugadorBaloncesto("Ana", "Lopez", 180, 60, LocalDate.of(1997, 9, 25), 30, Posicion.ALERO));
        jugadores.add(new JugadorBaloncesto("Miguel", "Fernandez", 100, 120, LocalDate.of(1998, 12, 30), 20, Posicion.ALA_PIVOT));
        jugadores.add(new JugadorBaloncesto("Sofia", "Martinez", 80, 150, LocalDate.of(1999, 4, 5), 10, Posicion.PIVOT));
        jugadores.add(new JugadorBaloncesto("Luis", "Hernandez", 130, 100, LocalDate.of(2000, 7, 10), 45, Posicion.BASE));
        jugadores.add(new JugadorBaloncesto("Elena", "Gutierrez", 110, 110, LocalDate.of(2001, 10, 15), 55, Posicion.ESCOLTA));
        jugadores.add(new JugadorBaloncesto("Pedro", "Vazquez", 160, 70, LocalDate.of(2002, 1, 20), 25, Posicion.ALERO));
        jugadores.add(new JugadorBaloncesto("Laura", "Diaz", 70, 160, LocalDate.of(2003, 4, 25), 15, Posicion.ALA_PIVOT));
        jugadores.add(new JugadorBaloncesto("Silvia", "Fuentes", 50, 180, LocalDate.of(2004, 7, 30), 5, Posicion.PIVOT));
        jugadores.add(new JugadorBaloncesto("Persona", "Nueva", 50, 180, LocalDate.of(2004, 7, 30), 5, Posicion.PIVOT));
    }

    public static void inicializarHashmap() {

        List<JugadorBaloncesto> jugadoresBase = new ArrayList<>();
        jugadoresBase.add(new JugadorBaloncesto("Carla", "Rodriguez", 150, 75, LocalDate.of(1995, 3, 15), 50, Posicion.BASE));
        jugadoresBase.add(new JugadorBaloncesto("Luis", "Hernandez", 130, 100, LocalDate.of(2000, 7, 10), 45, Posicion.BASE));

        List<JugadorBaloncesto> jugadoresEscolta = new ArrayList<>();
        jugadoresEscolta.add(new JugadorBaloncesto("Juan", "Gomez", 120, 90, LocalDate.of(1996, 6, 20), 40, Posicion.ESCOLTA));
        jugadoresEscolta.add(new JugadorBaloncesto("Elena", "Gutierrez", 110, 110, LocalDate.of(2001, 10, 15), 55, Posicion.ESCOLTA));

        List<JugadorBaloncesto> jugadoresAlero = new ArrayList<>();
        jugadoresAlero.add(new JugadorBaloncesto("Ana", "Lopez", 180, 60, LocalDate.of(1997, 9, 25), 30, Posicion.ALERO));
        jugadoresAlero.add(new JugadorBaloncesto("Pedro", "Vazquez", 160, 70, LocalDate.of(2002, 1, 20), 25, Posicion.ALERO));

        List<JugadorBaloncesto> jugadoresAleroPivot = new ArrayList<>();
        jugadoresAleroPivot.add(new JugadorBaloncesto("Miguel", "Fernandez", 100, 120, LocalDate.of(1998, 12, 30), 20, Posicion.ALA_PIVOT));
        jugadoresAleroPivot.add(new JugadorBaloncesto("Laura", "Diaz", 70, 160, LocalDate.of(2003, 4, 25), 15, Posicion.ALA_PIVOT));

        mapJugadoresPosicion.put(Posicion.BASE, jugadoresBase);
        mapJugadoresPosicion.put(Posicion.ESCOLTA, jugadoresEscolta);
        mapJugadoresPosicion.put(Posicion.ALERO, jugadoresAlero);
        mapJugadoresPosicion.put(Posicion.ALA_PIVOT, jugadoresAleroPivot);

        for (JugadorBaloncesto jugador : mapJugadoresPosicion.get(Posicion.BASE)) {
            System.out.println(jugador);
        }

    }

    public static Map<Posicion, List<JugadorBaloncesto>> clasificarJugadoresPorPosicion(List<JugadorBaloncesto> jugadores) {

        Map<Posicion, List<JugadorBaloncesto>> basketballPlayersHashMap = new HashMap<>();

        for (JugadorBaloncesto jugador : jugadores) {

            Posicion posicion = jugador.getPosicion();

            if (!basketballPlayersHashMap.containsKey(posicion)) {
                basketballPlayersHashMap.put(posicion, new ArrayList<>()); // crea un ArrayList vacio si la posicion no existe.
            }

            basketballPlayersHashMap.get(posicion).add(jugador);
        }
        System.out.println(basketballPlayersHashMap);

        for (Posicion posicion : basketballPlayersHashMap.keySet()) {

            System.out.println("\nJugadores con posicion -->" + posicion);
            List<JugadorBaloncesto> jugadorPorPosicion = basketballPlayersHashMap.get(posicion);

            for (JugadorBaloncesto jugador : jugadorPorPosicion) {
                System.out.println(jugador);
            }

        }

        return basketballPlayersHashMap;

    }

}