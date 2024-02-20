package curso.poo.figuras.figuras_herencia_polimorfismo;

import java.util.Random;

public abstract class Shape {

    enum Color {AZUL, ROJO, VERDE}

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Shape() {
        this.color = Color.values()[new Random().nextInt(Color.values().length)];
    }

    public abstract double area();

}
