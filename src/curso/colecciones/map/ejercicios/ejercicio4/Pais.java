package curso.colecciones.map.ejercicios.ejercicio4;

public class Pais {

    private String nombrePais;
    private String nombreCapital;

    public Pais(String nombrePais, String nombreCapital) {
        this.nombrePais = nombrePais;
        this.nombreCapital = nombreCapital;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public String getNombreCapital() {
        return nombreCapital;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombrePais='" + nombrePais + '\'' +
                ", nombreCapital='" + nombreCapital + '\'' +
                '}';
    }
}
