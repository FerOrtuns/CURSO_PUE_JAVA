package curso.poo.personas;

public class Asalariado extends Persona {

    private double sueldo;

    public Asalariado(String dni, String nombre, String apellido, double sueldo) {
        super(dni, nombre, apellido);
        this.sueldo = sueldo;
    }

}
