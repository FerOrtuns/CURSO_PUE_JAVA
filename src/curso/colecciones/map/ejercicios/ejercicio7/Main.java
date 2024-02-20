package curso.colecciones.map.ejercicios.ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static List<JugadorFutbol> jugadoresFutbol = new ArrayList<>();

    public static void main(String[] args) {
        insertarJugadoresFutbol();
        clasificarJugadoresPorPosicion(jugadoresFutbol);
    }

    // que tome la lista de jugadores y devuelva un HashMap que clasifique a los jugadores según su posición.
    public static void insertarJugadoresFutbol() {
        jugadoresFutbol.add(new JugadorFutbol("Lionel", "Messi", 72, 170, LocalDate.of(1987, 6, 24), Posicion.DELANTERO));
        jugadoresFutbol.add(new JugadorFutbol("Cristiano", "Ronaldo", 83, 187, LocalDate.of(1985, 2, 5), Posicion.DELANTERO));
        jugadoresFutbol.add(new JugadorFutbol("Sergio", "Ramos", 82, 184, LocalDate.of(1986, 3, 30), Posicion.DEFENSA));
        jugadoresFutbol.add(new JugadorFutbol("Neymar", "Jr.", 68, 175, LocalDate.of(1992, 2, 5), Posicion.DELANTERO));
        jugadoresFutbol.add(new JugadorFutbol("Andres", "Iniesta", 68, 171, LocalDate.of(1984, 5, 11), Posicion.CENTROCAMPISTA));
        jugadoresFutbol.add(new JugadorFutbol("Manuel", "Neuer", 92, 193, LocalDate.of(1986, 3, 27), Posicion.PORTERO));
        jugadoresFutbol.add(new JugadorFutbol("Robert", "Lewandowski", 81, 185, LocalDate.of(1988, 8, 21), Posicion.DELANTERO));
        jugadoresFutbol.add(new JugadorFutbol("Kevin", "De Bruyne", 70, 181, LocalDate.of(1991, 6, 28), Posicion.CENTROCAMPISTA));
        jugadoresFutbol.add(new JugadorFutbol("Kylian", "Mbappé", 73, 178, LocalDate.of(1998, 12, 20), Posicion.DELANTERO));
        jugadoresFutbol.add(new JugadorFutbol("Virgil", "van Dijk", 92, 193, LocalDate.of(1991, 7, 8), Posicion.DEFENSA));
        jugadoresFutbol.add(new JugadorFutbol("Luka", "Modric", 66, 172, LocalDate.of(1985, 9, 9), Posicion.CENTROCAMPISTA));
        jugadoresFutbol.add(new JugadorFutbol("Harry", "Kane", 86, 188, LocalDate.of(1993, 7, 28), Posicion.DELANTERO));
        jugadoresFutbol.add(new JugadorFutbol("Joshua", "Kimmich", 70, 176, LocalDate.of(1995, 2, 8), Posicion.CENTROCAMPISTA));
        jugadoresFutbol.add(new JugadorFutbol("Kalidou", "Koulibaly", 89, 195, LocalDate.of(1991, 6, 20), Posicion.DEFENSA));
        jugadoresFutbol.add(new JugadorFutbol("Mohamed", "Salah", 71, 175, LocalDate.of(1992, 6, 15), Posicion.DELANTERO));
        jugadoresFutbol.add(new JugadorFutbol("N'Golo", "Kanté", 70, 168, LocalDate.of(1991, 3, 29), Posicion.CENTROCAMPISTA));
        jugadoresFutbol.add(new JugadorFutbol("Eden", "Hazard", 74, 175, LocalDate.of(1991, 1, 7), Posicion.DELANTERO));
    }

    public static Map<Posicion, List<JugadorFutbol>> clasificarJugadoresPorPosicion(List<JugadorFutbol> jugadoresFutbol) {

        Map<Posicion, List<JugadorFutbol>> jugadoresHash = new HashMap<>();

        for (JugadorFutbol jugador : jugadoresFutbol) {

            Posicion posicion = jugador.getPosicion();

            if (!jugadoresHash.containsKey(posicion)) {
                jugadoresHash.put(posicion, new ArrayList<>());
            }

            jugadoresHash.get(posicion).add(jugador);

        }

        for (Posicion posicion : jugadoresHash.keySet()) {

            System.out.println("\nJugadores con posicion ---> " + posicion);
            List<JugadorFutbol> jugadoresPosicion = jugadoresHash.get(posicion);

            for (JugadorFutbol jugadorFutbol : jugadoresPosicion) {
                System.out.println(jugadorFutbol);
            }

        }

        return jugadoresHash;

    }


}
