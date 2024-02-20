package curso.colecciones.map;

import java.util.HashMap;
import java.util.Map;

public class EstructuraDeDatos_HashMap {

    public static void main(String[] args) {

        Map<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington 1");
        capitalCities.put("USA", "Washington 2");// Como tiene la misma clave, 'Washington 1' sera sustituido por 'Washington 2'
        capitalCities.putIfAbsent("USA", "Washington 3"); // Añade al 'Map' otro elemento siempre y cuando la clave no exista ni sea null
        capitalCities.put("Spain", "Madrid");
        System.out.println(capitalCities);

        System.out.println("Por su clave, te devuelve su valor --> " + capitalCities.get("Spain"));

        System.out.print("\n" + "Las keys son -----> ");

        for (String key : capitalCities.keySet()) {
            System.out.print(key + ", ");
        }

        System.out.print("\n" + "Los values son ---> ");

        for (String value : capitalCities.values()) {
            System.out.print(value + ", ");
        }

    }

}
