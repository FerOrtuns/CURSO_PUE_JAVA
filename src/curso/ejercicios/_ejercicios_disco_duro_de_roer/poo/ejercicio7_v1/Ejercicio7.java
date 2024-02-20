package curso.ejercicios._ejercicios_disco_duro_de_roer.poo.ejercicio7_v1;

public class Ejercicio7 {

    public static void main(String[] args) {

        Raiz raiz1 = new Raiz(1, 6, 9);
        Raiz raiz2 = new Raiz(4, 10, 2);
        Raiz raiz3 = new Raiz(4, 2, 9);

        Raiz raiz4 = new Raiz(1, -3, 2); // dos raices distintas
        Raiz raiz5 = new Raiz(1, -2, 1); // una unica raiz
        Raiz raiz6 = new Raiz(1, 2, 5); // Sin raices

        raiz1.calcular();
        raiz2.calcular();
        raiz3.calcular();
        System.out.println("\n");
        raiz4.calcular();
        raiz5.calcular();
        raiz6.calcular();

    }

}
