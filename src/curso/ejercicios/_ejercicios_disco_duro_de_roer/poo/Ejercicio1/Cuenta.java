package curso.ejercicios._ejercicios_disco_duro_de_roer.poo.Ejercicio1;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this(titular, 0);
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {

        if (cantidad > 0) {
            this.cantidad += cantidad;
        } else {
            System.out.println("No puedes introducir una cantidad negativa.");
        }

    }

    public void retirar(double cantidad) {

        if (this.cantidad - cantidad >= 0) {

            this.cantidad = this.cantidad - cantidad;

        }

    }

    @Override
    public String toString() {
        return "Datos de la cuenta {" + "titular='" + titular + '\'' + ", cantidad=" + cantidad + "€" + '}';
    }


}
