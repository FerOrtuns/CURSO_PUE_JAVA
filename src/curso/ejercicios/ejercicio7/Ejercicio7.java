package curso.ejercicios.ejercicio7;

// Write a method in Java that resolves this mathematical expression where x and y are two variables pre-set in your code.
public class Ejercicio7 {

    public static void main(String[] args) {

        System.out.println(formula());

    }

    public static double formula() {

        int x = 11;
        int y = 7;
        double resultado = x * x + (((4 * y) / 5 - x) * 2);

        return resultado;

    }

}
