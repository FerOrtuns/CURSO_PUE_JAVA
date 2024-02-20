package curso.ejercicios._ejercicios_disco_duro_de_roer.poo.ejercicio7;
/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado.
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podrán hacer son las siguientes:

obtenerRaices(): imprime las 2 posibles soluciones
obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, (b^2)-4*a*c
tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.
Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)
Solo varia el signo delante de -b
 */

public class Raiz {

    private double a;
    private double b;
    private double c;

    public Raiz(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices() {

        double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        System.out.println("Raiz 1: " + x1);
        System.out.println("Raiz 2: " + x2);

    }

    public void obtenerRaiz() {
        double raiz = (-b) / (2 * a);
        System.out.println("Unica Raiz: " + raiz);
    }

    public double getDiscriminante() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void calcular() {

        if (tieneRaiz()) {

            obtenerRaiz();

        } else if (tieneRaices()) {

            obtenerRaices();

        } else {

            System.out.println("La ecuacion no tiene solucion Real");

        }
    }

}
