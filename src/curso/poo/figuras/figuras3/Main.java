package curso.poo.figuras.figuras3;

// https://www.tutorjoes.in/java_programming_tutorial/array_exercise_programs_in_java
// Crear clase rectangulo que tenga largo y ancho. Que tenga un metodo para calcular el area y desde un main crear una lista con los rectangulos. Que la clase rectangulo implemente la interfaz comparable y que implemente el metodo compareTo y que ordene los rectangulos por su area.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<Rectangulo3> rectangulos = new ArrayList<>();

    public static void main(String[] args) {

        llenarListaRectangulos();
        calcularArea();

    }

    public static void llenarListaRectangulos() {
        rectangulos.add(new Rectangulo3(5, 7));
        rectangulos.add(new Rectangulo3(8, 13));
        rectangulos.add(new Rectangulo3(9, 19));
        rectangulos.add(new Rectangulo3(17, 34));
        rectangulos.add(new Rectangulo3(15, 56));
        rectangulos.add(new Rectangulo3(2, 8));
        rectangulos.add(new Rectangulo3(9, 5));
        rectangulos.add(new Rectangulo3(13, 81));
    }

    public static void calcularArea() {

        Collections.sort(rectangulos);

        for (Rectangulo3 rectangulo : rectangulos) {

            System.out.println(rectangulo);

        }

    }

}

