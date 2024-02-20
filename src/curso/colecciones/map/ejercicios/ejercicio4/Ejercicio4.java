package curso.colecciones.map.ejercicios.ejercicio4;

/*
Crea un HashMap llamado paisesCapitales que almacene nombres de países como claves y sus capitales como valores. Agrega al menos cinco pares clave-valor al HashMap. Realiza una consulta para obtener la capital de un país específico y muéstralo por consola.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio4 {

    private static Map<String, Pais> paisesCapitales = new HashMap<>();

    public static void main(String[] args) {

        List<Pais> paises = List.of(
                new Pais("Francia", "Paris"),
                new Pais("España", "Madrid"),
                new Pais("Belgica", "Bruselas"),
                new Pais("Alemania", "Berlin"),
                new Pais("Reino Unido", "Londres")
        );

        for (Pais pais : paises) {
            paisesCapitales.put(pais.getNombrePais(), pais);
        }

        for (Pais pais : paisesCapitales.values()) {

            if (pais.getNombreCapital() == "Bruselas") {
                System.out.println(pais);
            }

        }

        // FUNCIONAL
        paisesCapitales.values().stream().filter(p -> p.getNombreCapital() == "Bruselas").forEach(System.out::println);

    }

}
