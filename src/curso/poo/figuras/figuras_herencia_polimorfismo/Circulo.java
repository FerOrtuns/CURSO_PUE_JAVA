package curso.poo.figuras.figuras_herencia_polimorfismo;

public class Circulo extends Shape {

    private double radio;

    public Circulo(double radio, Shape.Color color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        System.out.println("Estoy calculando el area de un circulo");
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return String.format("Circulo {radio=%.2fm, area=%.2f, perimetro=%.2fm, color='%s'}", radio, area(), calcularPerimetro(), Color.AZUL);
    }
}