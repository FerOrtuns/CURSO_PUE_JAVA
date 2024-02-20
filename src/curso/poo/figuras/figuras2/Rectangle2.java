package curso.poo.figuras.figuras2;

/*
Crear clase rectangulo que tenga largo y ancho. Que tenga un metodo para calcular el area y desde un main crear una lista con los rectangulos. Que la clase rectangulo implemente la interfaz comparable y que implemente el metodo compareTo y que ordene los rectangulos por su area.
 */

import java.text.DecimalFormat;

public class Rectangle2 implements Comparable<Rectangle2> {

    enum Color {AZUL, ROJO, VERDE}

    private double lenght;
    private double width;
    private Color color;

    public Rectangle2(double lenght, double width, Color color) {
        this.lenght = lenght;
        this.width = width;
        this.color = color;
    }

    public double calculateArea() {
        return lenght * width;
    }

    public double calculatePerimeter() {
        return (2 * lenght) + (2 * width);
    }

    @Override
    public String toString() {
        double area = calculateArea();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return "Rectangulo {" + "lenght=" + lenght + ", width=" + width + ", area=" + decimalFormat.format(area) +
                ", perimeter=" + decimalFormat.format(calculatePerimeter()) + "'}'";
    }

    @Override
    public int compareTo(Rectangle2 o) {
        return Double.compare(calculateArea(), o.calculateArea());
    }

}