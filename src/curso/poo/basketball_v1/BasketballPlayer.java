package curso.poo.basketball_v1;

import java.time.LocalDate;

public class BasketballPlayer implements Comparable<BasketballPlayer> {

    private String name;
    private String lastName;
    private int basket;
    private int rebound;
    private LocalDate dateOfBirth;
    private int assistance;
    private Position position;

    public BasketballPlayer(String name, String lastName, int basket, int rebound, LocalDate dateOfBirth, int assistance, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.basket = basket;
        this.rebound = rebound;
        this.dateOfBirth = dateOfBirth;
        this.assistance = assistance;
        this.position = position;
    }

    public int getBasket() {
        return basket;
    }

    public int getRebound() {
        return rebound;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" + "\n\tname='" + name + '\'' + "\n\tlastName='" + lastName + '\'' + "\n\tbasket=" + basket + "\n\trebound=" + rebound + "\n\tdateOfBirth=" + dateOfBirth + "\n\tassistance=" + assistance + "\n\tposition=" + position + "\n}";
    }

    @Override
    public int compareTo(BasketballPlayer o) {

        return Integer.compare(this.basket, o.basket);

    }

}
