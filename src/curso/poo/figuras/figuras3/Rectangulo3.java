package curso.poo.figuras.figuras3;

class Rectangulo3 implements Comparable<Rectangulo3> {

    private double largo;
    private double ancho;

    public Rectangulo3(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "largo=" + largo +
                ", ancho=" + ancho + " area=" + calcularArea() +
                '}';
    }

    @Override
    public int compareTo(Rectangulo3 o) {
        return Double.compare(this.calcularArea(), o.calcularArea());
    }
}