package curso.poo.basketball;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<BasketballPlayer> basketballPlayers = new ArrayList<>();

    public static void main(String[] args) {

        createPlayers();
        printPlayers();
//        filterByTypeOfPlayerAndNumberOfBasket();

    }

    public static void createPlayers() {

        basketballPlayers.add(new BasketballPlayer("Carla", "Rodriguez"));
        basketballPlayers.add(new BasketballPlayer("Juan", "Gomez"));
        basketballPlayers.add(new BasketballPlayer("Ana", "Lopez"));
        basketballPlayers.add(new BasketballPlayer("Miguel", "Fernandez"));
        basketballPlayers.add(new BasketballPlayer("Sofia", "Martinez"));
        basketballPlayers.add(new BasketballPlayer("Luis", "Hernandez"));
        basketballPlayers.add(new BasketballPlayer("Elena", "Gutierrez"));
        basketballPlayers.add(new BasketballPlayer("Pedro", "Vazquez"));
        basketballPlayers.add(new BasketballPlayer("Laura", "Diaz"));
        basketballPlayers.add(new BasketballPlayer("Silvia", "Fuentes"));
    }

    public static void printPlayers() {

        for (BasketballPlayer player : basketballPlayers) {
            System.out.println(player.toString());
        }

    }

    public static void filterByTypeOfPlayerAndNumberOfBasket() {

        int totalBaskets = 100;
        // No funciona porque estoy generando las posiciones de manera random y de momento me quede bloqueado en esta parte.
        basketballPlayers.stream().filter(basketballPlayer -> basketballPlayer.generateRandomPosition() == Position.ALERO && basketballPlayer.generateRandomBasket() > totalBaskets).forEach(System.out::println);

    }

}