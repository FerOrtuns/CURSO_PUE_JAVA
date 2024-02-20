package curso.colecciones.map.ejercicios.ejercicio3;

/*
Crea un HashMap llamado inventarioProductos que almacene el nombre de un producto como clave y su precio como valor. Agrega al menos cuatro productos al HashMap. Luego, muestra por consola los productos cuyo precio sea superior a un valor específico que determines.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio3 {

    private static Map<String, Producto> inventarioProductos = new HashMap<>();

    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
                new Producto("Ordenador", 1200),
                new Producto("Cepillo", 4),
                new Producto("Plancha", 120),
                new Producto("Coche", 21300),
                new Producto("Memoria Ram", 80),
                new Producto("Libro", 24)
        );

        for (Producto producto : productos) {
            inventarioProductos.put(producto.getNombreProducto(), producto);
        }

        System.out.print(inventarioProductos + ", ");

        System.out.println("Filtrar productos:");

        for (Producto producto : inventarioProductos.values()) {

            if (producto.getPrecio() < 300) {

                System.out.println(producto.getNombreProducto() + " : " + producto.getPrecio());

            }

        }

        // FUNCIONAL
        System.out.println("Filtrar productos FUNCIONAL:");
        inventarioProductos.values().stream()
                .filter(p -> p.getPrecio() < 300)
                .forEach(p -> System.out.println(p.getNombreProducto() + ": " + p.getPrecio()));

    }

}
