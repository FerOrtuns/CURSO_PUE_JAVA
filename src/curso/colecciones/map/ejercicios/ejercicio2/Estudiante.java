package curso.colecciones.map.ejercicios.ejercicio2;

public class Estudiante {

    private String nombre;
    private int edad;
    private String curso;
    private double promedio;

    public Estudiante(String nombre, int edad, String curso, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getPromedio() {
        return promedio;
    }

}
