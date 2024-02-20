package curso.colecciones.map.ejercicios.ejercicio1;

/*
Crea un HashMap llamado miMapa que almacene nombres de personas como claves y sus edades como valores. Agrega al menos tres pares clave-valor al HashMap. Luego, muestra por consola todas las claves y sus respectivos valores.
 */

import java.util.*;

public class Ejercicio1 {

    private static Map<String, Integer> miMapa = new HashMap<>();

    public static void main(String[] args) {

        miMapa.put("Pablo", 33);
        miMapa.put("Alejandro", 39);
        miMapa.put("Raul", 40);

        System.out.println(miMapa);


    }

}