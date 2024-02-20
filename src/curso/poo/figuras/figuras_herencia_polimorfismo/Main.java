package curso.poo.figuras.figuras_herencia_polimorfismo;

import curso.poo.personas.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(16, 70, Shape.Color.AZUL);
        Circulo circulo = new Circulo(67, Shape.Color.ROJO);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(rectangle);
        shapes.add(circulo);

        for (Shape shape : shapes) {
            System.out.println("El area es = " + shape.area());
        }

        Persona p = new Persona("dni", "nombre", "apellido");


    }

}
