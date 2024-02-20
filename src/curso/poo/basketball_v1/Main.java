package curso.poo.basketball_v1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static List<BasketballPlayer> basketballPlayers = new ArrayList<>();

    public static void main(String[] args) {

        createPlayers();
        printPlayers();
        filterByTypeOfPlayerAndNumberOfBasket();
        filterByTypeOfPlayerAndNumberOfBasketFunctionalWay();
        averageOfReboundByPivots();
        averageOfReboundByPivotsFunctionalWay();
        top5PlayersBetween18and23AgeWithMoreBaskets();
        top5PlayersBetween18and23AgeWithMoreBasketsFunctional();

    }

    public static void createPlayers() {
        basketballPlayers.add(new BasketballPlayer("Carla", "Rodriguez", 150, 75, LocalDate.of(1995, 3, 15), 50, Position.BASE));
        basketballPlayers.add(new BasketballPlayer("Juan", "Gomez", 120, 90, LocalDate.of(1996, 6, 20), 40, Position.ESCOLTA));
        basketballPlayers.add(new BasketballPlayer("Ana", "Lopez", 180, 60, LocalDate.of(1997, 9, 25), 30, Position.ALERO));
        basketballPlayers.add(new BasketballPlayer("Miguel", "Fernandez", 100, 120, LocalDate.of(1998, 12, 30), 20, Position.ALA_PIVOT));
        basketballPlayers.add(new BasketballPlayer("Sofia", "Martinez", 80, 150, LocalDate.of(1999, 4, 5), 10, Position.PIVOT));
        basketballPlayers.add(new BasketballPlayer("Luis", "Hernandez", 130, 100, LocalDate.of(2000, 7, 10), 45, Position.BASE));
        basketballPlayers.add(new BasketballPlayer("Elena", "Gutierrez", 110, 110, LocalDate.of(2001, 10, 15), 55, Position.ESCOLTA));
        basketballPlayers.add(new BasketballPlayer("Pedro", "Vazquez", 160, 70, LocalDate.of(2002, 1, 20), 25, Position.ALERO));
        basketballPlayers.add(new BasketballPlayer("Laura", "Diaz", 70, 160, LocalDate.of(2003, 4, 25), 15, Position.ALA_PIVOT));
        basketballPlayers.add(new BasketballPlayer("Silvia", "Fuentes", 50, 180, LocalDate.of(2004, 7, 30), 5, Position.PIVOT));
    }

    public static void printPlayers() {

        for (BasketballPlayer player : basketballPlayers) {
            System.out.println(player.toString());
        }

    }

    public static void filterByTypeOfPlayerAndNumberOfBasket() {

        System.out.println("Players who are ALERO and have more than 100 baskets (With ForEach):");

        for (BasketballPlayer basketballPlayer : basketballPlayers) {

            if (basketballPlayer.getPosition() == Position.ALERO && basketballPlayer.getBasket() > 100) {

                System.out.println(basketballPlayer);

            }

        }

    }

    public static void filterByTypeOfPlayerAndNumberOfBasketFunctionalWay() {

        int totalBaskets = 100;

        System.out.println("Players who are ALERO and have more than 100 baskets (Functional):");

        basketballPlayers.stream().filter(basketballPlayer -> basketballPlayer.getPosition() == Position.ALERO && basketballPlayer.getBasket() > totalBaskets).forEach(System.out::println);

    }

    public static void averageOfReboundByPivots() {

        int totalRebounds = 0;
        double averageRebounds;

        for (BasketballPlayer basketballPlayer : basketballPlayers) {

            if (basketballPlayer.getPosition() == Position.PIVOT) {

                totalRebounds += basketballPlayer.getRebound();

            }

        }

        averageRebounds = ((double) totalRebounds / 2);
        System.out.println("The average number of rebounds was: " + averageRebounds);

    }

    public static void averageOfReboundByPivotsFunctionalWay() {

        double averageRebounds = basketballPlayers.stream().filter(basketballPlayer -> basketballPlayer.getPosition() == Position.PIVOT).mapToInt(BasketballPlayer::getRebound).average().orElse(0.0);

        System.out.println("The average number of rebounds was: " + averageRebounds);

    }

    public static void top5PlayersBetween18and23AgeWithMoreBaskets() {

        System.out.println("Basketball players between 18 and 23 age by number of baskets.");

        int currentYear = LocalDate.now().getYear();

        Collections.sort(basketballPlayers);

        for (int i = 0; i < basketballPlayers.size() - 1; i++) {
            int basketballPlayerBirth = basketballPlayers.get(i).getDateOfBirth().getYear();
            int basketballPlayerAge = currentYear - basketballPlayerBirth;

            if (basketballPlayerAge >= 18 && basketballPlayerAge <= 23) {

                int baskets = basketballPlayers.get(i).getBasket();
                int resultado = basketballPlayers.get(i).compareTo(basketballPlayers.get(i + 1));

                System.out.println(basketballPlayers.get(i));

            }
        }
    }

    public static void top5PlayersBetween18and23AgeWithMoreBasketsFunctional() {

        System.out.println("Basketball players between 18 and 23 age by number of baskets. (Functional)");

        int currentYear = LocalDate.now().getYear();

        basketballPlayers.stream().filter(b -> {
            int playerBirthYear = b.getDateOfBirth().getYear();
            int playerAge = currentYear - playerBirthYear;
            return playerAge >= 18 && playerAge <= 23;
        }).sorted().limit(5).forEach(System.out::println);

    }

}