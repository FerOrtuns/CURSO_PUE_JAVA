package curso.ejercicios.extra1;

public class SumaParesMultiplicacionImpares {

    public static void main(String[] args) {

        int sumaPares = 0;
        int productoImpares = 1;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {

                sumaPares += i;

            } else if (i == 15) {

                break;

            } else {

                productoImpares *= i;
            }
        }

        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La multiplicacion de los numeros impares es: " + productoImpares);

    }

}
