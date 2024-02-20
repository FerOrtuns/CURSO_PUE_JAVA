package curso.colecciones.map.ejercicios.ejercicio5;

/*
Crea un HashMap llamado registroVentas que almacene el nombre de un producto como clave y la cantidad vendida como valor. Registra ventas para al menos tres productos diferentes. Luego, filtra y muestra por consola los productos que han tenido más de 10 unidades vendidas.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {

    private static Map<String, Producto> registroVentas = new HashMap<>();

    public static void main(String[] args) {

        List<Producto> productos = List.of(
                new Producto("Television", 300),
                new Producto("Tamagotchi", 90),
                new Producto("Diablo 2", 2),
                new Producto("Monkey Island", 40),
                new Producto("Super Quique Cefa", 250)
        );

        for (Producto producto : productos) {

            registroVentas.put(producto.getNombre(), producto);

        }

        for (Producto producto : registroVentas.values()) {

            if (producto.getCantidad() >= 40) {
                System.out.print(producto);
            }

        }

        System.out.println();
        // FUNCIONAL
        registroVentas.values().stream().filter(p -> p.getCantidad() >= 40).forEach(System.out::print);

    }

}
