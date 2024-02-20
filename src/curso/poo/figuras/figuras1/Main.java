package curso.poo.figuras.figuras1;


import java.util.*;

public class Main {

    private static Random random = new Random();
    private static List<Circulo1> circulos = new LinkedList<>();
    private static List<Circulo1> circulosEspecificos = new LinkedList<>();

    public static void main(String[] args) {

        circulosRandom();
        obtenerCirculosEspecificos(circulos, "Rojo");
        calcular();

    }

    public static void circulosRandom() {

        for (int i = 0; i < 15; i++) {

            double radio = random.nextDouble() * 10;
            double perimetro = random.nextDouble() * 20;
            String color = colorRandom();
            circulos.add(new Circulo1(radio, Circulo1.Color.ROJO));
            System.out.printf("%dº %s. Su área es de: %.2f m²%n", (i + 1), circulos.get(i).toString(), circulos.get(i).calcularArea());

        }
    }

    public static String colorRandom() {

        String[] colores = {"Amarillo", "Verde", "Rojo", "Azul", "Naranja", "Violeta", "Negro", "Blanco"};
        int color = random.nextInt(colores.length);
        return colores[color];

    }

    public static void obtenerCirculosEspecificos(List<Circulo1> circulos, String color) {

        System.out.println("<------------ Circulos del color pasado por parametro ------------>");

        int i = 0;
        for (Circulo1 circulo : circulos) {

            if (Objects.equals(circulo.getColor(), color)) {
                circulosEspecificos.add(circulo);
                System.out.println(circulosEspecificos.get(i++).toString());
            }

        }
    }

    public static void calcular() {

        System.out.println("<------------ Calcular area maxima, minima y media total de las areas ------------>");

        double areaMaxima = 0.0;
        double areaMinima = Double.MAX_VALUE;
        double mediaAreaTodosLosCirculos = 0.0;
        int numeroDeAreas = 0;
        double sumaDeTodasLasAreas = 0.0;

        for (Circulo1 circulo : circulos) {

            numeroDeAreas++;
            sumaDeTodasLasAreas += circulo.calcularArea();
            mediaAreaTodosLosCirculos = (sumaDeTodasLasAreas / numeroDeAreas);

            if (areaMinima > circulo.calcularArea()) {
                areaMinima = circulo.calcularArea();
            } else if (areaMaxima < circulo.calcularArea()) {
                areaMaxima = circulo.calcularArea();
            }

        }

        System.out.println("Area maxima: " + areaMaxima);
        System.out.println("Area minima: " + areaMinima);
        System.out.println("Media de todas las areas: " + mediaAreaTodosLosCirculos);

    }

}