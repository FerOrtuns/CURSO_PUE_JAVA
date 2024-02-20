package curso.ejercicios.ejercicio1;

import java.util.Scanner;
//Realiza un programa que calcule el factorial de un número determinado por el usuario.
public class Ejercicio1 {

    public static void main(String[] args) {

        long factorial = 1;
        Scanner sc = new Scanner(System.in);
        long numero;

        System.out.println("Introduce un numero y calcularemos su factorial:");

        numero = sc.nextLong();

        for (int i = 0; i < numero; numero--) {

            factorial *= numero;
        }

        System.out.println("El factorial es: " + factorial);
        sc.close();
    }

}