package curso.poo.figuras.figuras1;

/*
1º circulo Tendrá color de tipo string y en un metodo main sencillo una lista de circunferencias. Usar metodo Random. Para cada circunferencia calcular area y perimetro.
2º hacer un metodo auxiliar y que reciba una lista de circunferencias y que reciba un 2º parametro que sea el colo de tipo string. Este metodo retornara otra lista que solo tenga las circunferencias del color pasado como parámetro y que este metodo auxiliar sea llamado por el main. También muestre por la consola la circunferencia de area maxima, minima y la media del area de todas las circunferencias.
 */

public class Circulo1 {

    enum Color {AZUL, ROJO, VERDE}

    private double radio;
    private Color color;

    public Circulo1(double radio, Color color) {
        this.radio = radio;
        this.color = color;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public Color getColor() {
        return color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return String.format("Circulo {radio=%.2fm, area=%.2f, perimetro=%.2fm, color='%s'}", radio, calcularArea(), calcularPerimetro(), color);
    }
}