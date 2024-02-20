package curso.poo.basketball;

import java.time.LocalDate;
import java.util.Random;

public class BasketballPlayer {

    private static Random random = new Random();
    private String name;
    private String lastName;
    private int basket;
    private int rebound;
    private LocalDate dateOfBirth;
    private int assistance;
    private Position position;

    public LocalDate generateRandomDate() {

        int year = random.nextInt(26) + 1980;
        int month = random.nextInt(12) + 1;
        int maxDaysInMonth = LocalDate.of(year, month, 1).lengthOfMonth();
        int day = random.nextInt(maxDaysInMonth) + 1;

        return LocalDate.of(year, month, day);
    }

    public BasketballPlayer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.basket = generateRandomBasket();
        this.rebound = generateRandomRebound();
        this.dateOfBirth = generateRandomDate();
        this.assistance = generateRandomAssistance();
        this.position = generateRandomPosition();
    }

    public int generateRandomBasket() {
        return basket = random.nextInt(200) + 1;
    }

    public int generateRandomRebound() {
        return rebound = random.nextInt(50) + 1;
    }

    public int generateRandomAssistance() {
        return assistance = random.nextInt(50) + 1;
    }

    public Position generateRandomPosition() {

        int randomPosition = random.nextInt(5) + 1;

        if (randomPosition == 1) {
            return Position.BASE;
        } else if (randomPosition == 2) {
            return Position.ESCOLTA;
        } else if (randomPosition == 3) {
            return Position.ALERO;
        } else if (randomPosition == 4) {
            return Position.ALA_PIVOT;
        } else {
            return Position.PIVOT;
        }
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" + "\n\tname='" + name + '\'' + "\n\tlastName='" + lastName + '\'' + "\n\tbasket=" + basket + "\n\trebound=" + rebound + "\n\tdateOfBirth=" + dateOfBirth + "\n\tassistance=" + assistance + "\n\tposition=" + position + "\n}";
    }

}
