package curso.ejercicios._ejercicios_disco_duro_de_roer.poo.Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta("Calimero");

        cuenta.ingresar(1000);
        cuenta.retirar(200);

        System.out.println(cuenta);

    }

}
