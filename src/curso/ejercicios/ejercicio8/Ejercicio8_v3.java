package curso.ejercicios.ejercicio8;

import java.util.Scanner;

public class Ejercicio8_v3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroRectangulos = 5;
        int rectangulos[][] = new int[numeroRectangulos][2];
        float mediaAreas = 0;
        int totalAreas = 0;
        int posicionRectangulo = 0;
        int areaRectangulo = 0;

        for (int i = 0; i < numeroRectangulos; i++) {

            System.out.println("Introduzca el largo del rectangulo:");
            int altura = sc.nextInt();

            System.out.println("Introduzca el ancho del rectangulo:");
            int base = sc.nextInt();

            rectangulos[i][0] = calcularArea(base, altura);
            rectangulos[i][1] = calcularPerimetro(base, altura);

            if (rectangulos[i][0] > areaRectangulo) {
                areaRectangulo = rectangulos[i][0];
                posicionRectangulo = i + 1;
            }

            totalAreas += rectangulos[i][0];

            System.out.printf("Rectangulo %d: El area es: %d y el perimetro es: %d \n", i + 1, rectangulos[i][0], rectangulos[i][1]);
        }

        mediaAreas = totalAreas / numeroRectangulos;

        System.out.printf("La media de los rectangulos es de %.2f", mediaAreas);

        System.out.printf("La posicion del rectangulo cuya area es maxima es %d", posicionRectangulo);

    }

    public static int calcularArea(int base, int altura) {
        int area = base * altura;
        return area;
    }

    public static int calcularPerimetro(int base, int altura) {
        int perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

}
