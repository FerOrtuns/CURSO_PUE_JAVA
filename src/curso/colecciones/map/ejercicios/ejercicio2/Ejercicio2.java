package curso.colecciones.map.ejercicios.ejercicio2;

/*
Crea un HashMap llamado datosEstudiante que almacene información sobre un estudiante, como "nombre", "edad", "curso" y "promedio". Agrega información para al menos dos estudiantes al HashMap. Muestra por consola la información de un estudiante específico utilizando su nombre como clave.
 */

import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {

    private static Map<String, Estudiante> datosEstudiantes = new HashMap<>();

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Juan", 20, "Informática", 75.5);
        Estudiante estudiante2 = new Estudiante("Maria", 22, "Matemáticas", 80.0);
        Estudiante estudiante3 = new Estudiante("Carlos", 22, "Geologia", 90.0);
        Estudiante estudiante4 = new Estudiante("Irene", 22, "Fisica", 100.0);

        datosEstudiantes.put(estudiante1.getNombre(), estudiante1);
        datosEstudiantes.put(estudiante2.getNombre(), estudiante2);
        datosEstudiantes.put(estudiante3.getNombre(), estudiante3);
        datosEstudiantes.put(estudiante4.getNombre(), estudiante4);

        Estudiante juan = datosEstudiantes.get("Irene");
        System.out.println("Nombre: " + juan.getNombre());
        System.out.println("Edad: " + juan.getEdad());
        System.out.println("Curso: " + juan.getCurso());
        System.out.println("Promedio: " + juan.getPromedio());

    }

}
