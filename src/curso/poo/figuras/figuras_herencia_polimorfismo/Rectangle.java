package curso.poo.figuras.figuras_herencia_polimorfismo;

import java.text.DecimalFormat;

public class Rectangle extends Shape {

    private double lenght;
    private double width;

    public Rectangle(double lenght, double width, Color azul) {
        super(Color.VERDE);
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double area() {
        System.out.println("Estoy calculando el area de un rectangulo");
        return lenght * width;
    }

    public double calculatePerimeter() {
        return (2 * lenght) + (2 * width);
    }

    @Override
    public String toString() {
        double area = area();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return "Rectangulo {" + "lenght=" + lenght + ", width=" + width + ", area=" + decimalFormat.format(area) +
                ", perimeter=" + decimalFormat.format(calculatePerimeter()) + "'}'";
    }

}