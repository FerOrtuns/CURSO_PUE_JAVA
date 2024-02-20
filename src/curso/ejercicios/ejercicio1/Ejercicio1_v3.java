package curso.ejercicios.ejercicio1;

public class Ejercicio1_v3 {

    public static void main(String[] args) {

        int x = 4;
        int factorial = 1;
        int i = 1;

        do {
            System.out.println("La 'i' vale " + i);
            System.out.println("El factorial actual =" + factorial);
            factorial = factorial * i;
            System.out.println("El factorial actualizado es = " + factorial);
            i++;
        }
        while (i <= x);


        System.out.println("Factorial al final = " + factorial);

    }
}
