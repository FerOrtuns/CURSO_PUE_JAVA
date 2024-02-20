package curso.colecciones.map.ejercicios.ejercicio3;

public class Producto {

    private String nombreProducto;
    private int precio;

    public Producto(String nombreProducto, int precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
