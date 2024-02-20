package curso.ejercicios._ejercicios_disco_duro_de_roer.poo.Ejercicio2;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce una edad:");
        int edad = sc.nextInt();

        System.out.println("Introduce un sexo:");
        String sexoStr = sc.next();
        char sexo = sexoStr.charAt(0);

        System.out.println("Introduce un peso:");
        int peso = sc.nextInt();

        System.out.println("Introduce una altura:");
        int altura = sc.nextInt();

        Persona persona = new Persona(nombre, edad, peso, altura, sexo);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        System.out.println(persona);
        System.out.println(persona2);
        System.out.println(persona3);

    }

}
