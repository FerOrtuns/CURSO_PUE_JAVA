package curso.colecciones.map.ejercicios.ejercicio7;

import java.time.LocalDate;

public class JugadorFutbol {

    private String nombre;
    private String apellido;
    private double peso;
    private double altura;
    private LocalDate fechaNacimiento;
    private Posicion posicion;

    public JugadorFutbol(String nombre, String apellido, double peso, double altura, LocalDate fechaNacimiento, Posicion posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.altura = altura;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "JugadorFutbol{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", fechaNacimiento=" + fechaNacimiento +
                ", posicion=" + posicion +
                '}';
    }

}
