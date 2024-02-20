package curso.colecciones.map.ejercicios.ejercicio6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio6 {

    private static Map<Color, String> hashCoche = new HashMap<>();
    private static List<Coche> listaCoches = new ArrayList<>();

    public static void main(String[] args) {
        llenarListaCoche(listaCoches);
    }

    private static void llenarListaCoche(List<Coche> coches) {
        coches.add(new Coche("Audi", "A3", Color.ROJO));
        coches.add(new Coche("Ford", "Focus", Color.AMARILLO));
        coches.add(new Coche("Toyota", "Camry", Color.VERDE));
        coches.add(new Coche("Chevrolet", "Malibu", Color.MORADO));
        coches.add(new Coche("BMW", "X5", Color.NEGRO));
        coches.add(new Coche("Mercedes-Benz", "C-Class", Color.BLANCO));
        coches.add(new Coche("Honda", "Civic", Color.ROJO));
        coches.add(new Coche("Volkswagen", "Golf", Color.NEGRO));
        coches.add(new Coche("Hyundai", "Elantra", Color.AMARILLO));
        coches.add(new Coche("Nissan", "Altima", Color.MORADO));
    }

    private static List<Coche> filtrarCochesPorColor(){

return null;

    }


}
