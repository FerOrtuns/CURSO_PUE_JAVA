package curso.poo.personas;

public class Autonomo extends Persona {

    private double facturacion;

    public Autonomo(String dni, String nombre, String apellido, double facturacion) {
        super(dni, nombre, apellido);
        this.facturacion = facturacion;
    }

    @Override
    public String toString() {
        return "Autonomo{" + "facturacion=" + facturacion + '}';
    }
}

