package curso.ejercicios.ejercicio8;

/*
Rectángulos:
Realiza un programa  que pida al usuario la información para crear un rectángulo.
El programa pedirá al usuario que especifique  las dimensiones del rectángulo:  largo y ancho.
Después el programa ha de calcular el área y el perímetro del rectángulo.
Siguiente paso.  Haz que el programa sea capaz de almacenar  cinco rectángulos especificados por el usuario.  Primero utiliza un bucle tradicional.  Después realiza la misma operación con un bucle foreach.
Muestra por la consola  la lista de rectángulos,  de manera que  aparezcan las características de cada rectángulo de uno a uno.
A continuación,  muestra la media del área de todos los rectángulos.
Finalmente,  muestra por la consola la posición del rectángulo cuya área es máxima.
*/

import java.util.Scanner;

public class Ejercicio8 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void pedirInformacionRectangulo() {

        System.out.println("Introduzca el largo del rectangulo:");
        int altura = sc.nextInt();

        System.out.println("Introduzca el ancho del rectangulo:");
        int base = sc.nextInt();

        calcularArea(base, altura);

    }

    public static void calcularArea(int base, int altura) {
        int area = base * altura;
    }

    public static void calcularPerimetro(int base, int altura) {
        int perimetro = (base * 2) + (altura * 2);
    }

}
