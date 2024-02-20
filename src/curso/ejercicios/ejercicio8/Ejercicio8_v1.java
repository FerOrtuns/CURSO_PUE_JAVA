package curso.ejercicios.ejercicio8;

import java.util.Scanner;

public class Ejercicio8_v1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numeroRectangulos = 5;
        int rectangulos[][] = new int[numeroRectangulos][2];
        float mediaAreas = 0;
        int totalAreas = 0;

        for (int i = 0; i < numeroRectangulos; i++) {

            System.out.println("Introduzca el largo del rectangulo:");
            int altura = sc.nextInt();

            System.out.println("Introduzca el ancho del rectangulo:");
            int base = sc.nextInt();

            rectangulos[i][0] = calcularArea(base, altura);
            rectangulos[i][1] = calcularPerimetro(base, altura);

            totalAreas += rectangulos[i][0];

            System.out.printf("Rectangulo %d: El area es: %d y el perimetro es: %d \n", i + 1, rectangulos[i][0], rectangulos[i][1]);
        }

        mediaAreas = totalAreas / numeroRectangulos;

        System.out.printf("La media de los rectangulos es de %.2f", mediaAreas);

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
