package curso.poo.figuras.figuras2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static List<Rectangle2> rectangleList = new ArrayList<>();

    public static void main(String[] args) {

        createRectangle();
        sortRectanglesByArea();

    }

    private static void createRectangle() {

        rectangleList.add(new Rectangle2(43.5, 41, Rectangle2.Color.AZUL));
        rectangleList.add(new Rectangle2(15.8, 23, Rectangle2.Color.ROJO));
        rectangleList.add(new Rectangle2(65.1, 43, Rectangle2.Color.VERDE));
        rectangleList.add(new Rectangle2(73.1, 72, Rectangle2.Color.ROJO));
        rectangleList.add(new Rectangle2(12.2, 63, Rectangle2.Color.VERDE));
        rectangleList.add(new Rectangle2(6.2, 14, Rectangle2.Color.AZUL));
        rectangleList.add(new Rectangle2(14, 8, Rectangle2.Color.VERDE));
        rectangleList.add(new Rectangle2(19.2, 4, Rectangle2.Color.AZUL));
        rectangleList.add(new Rectangle2(23, 17, Rectangle2.Color.ROJO));
        rectangleList.add(new Rectangle2(5, 5, Rectangle2.Color.VERDE));

    }

    public static void sortRectanglesByArea() {

        Collections.sort(rectangleList);

        for (Rectangle2 rectangle : rectangleList) {

            double area = rectangle.calculateArea();
            System.out.printf("%.2f%n", area);

        }

    }

}