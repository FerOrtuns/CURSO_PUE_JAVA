package curso.colecciones.map.ejercicios.basketball_v2_hashmap;

import java.time.LocalDate;

public class JugadorBaloncesto {

    private String nombre;
    private String apellido;
    private int puntosEncestados;
    private int rebotes;
    private LocalDate fechaNacimiento;
    private int asistencias;
    private Posicion posicion;

    public JugadorBaloncesto(String nombre, String apellido, int puntosEncestados, int rebotes, LocalDate fechaNacimiento, int asistencias, Posicion posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntosEncestados = puntosEncestados;
        this.rebotes = rebotes;
        this.fechaNacimiento = fechaNacimiento;
        this.asistencias = asistencias;
        this.posicion = posicion;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "JugadorBaloncesto{" +
                "\n\tnombre='" + nombre + '\'' +
                "\n\tapellido='" + apellido + '\'' +
                "\n\tpuntosEncestados=" + puntosEncestados +
                "\n\trebotes=" + rebotes +
                "\n\tfechaNacimiento=" + fechaNacimiento +
                "\n\tasistencias=" + asistencias +
                "\n\tposicion=" + posicion +
                "\n}";
    }

}
