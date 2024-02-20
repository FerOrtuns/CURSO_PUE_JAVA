package curso.ejercicios._ejercicios_disco_duro_de_roer.poo.ejercicio3;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int tamañoArray = 0;
    private static int[] arrayContraseñas = new int[tamañoArray];

    public static void main(String[] args) {
        //Introducimos el tamaño del array y la longitud del password
        String texto= JOptionPane.showInputDialog("Introduce un tamaño para el array");
        int tamanio=Integer.parseInt(texto);

        texto=JOptionPane.showInputDialog("Introduce la longitud del password");
        int longitud=Integer.parseInt(texto);

        //Creamos los arrays
        Password listaPassword[]=new Password[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];

        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Password(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContraseña()+" "+fortalezaPassword[i]);
        }
    }

    private static void crearArray() {

        System.out.println("Introduce un tamaño para la contraseña.");
        tamañoArray = sc.nextInt();

    }

}
