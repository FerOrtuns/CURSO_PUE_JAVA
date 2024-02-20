package curso.poo.trivial;

public class Pregunta {

    private String afirmacion;
    private boolean esCorrecto = true;
    private int dificultad;

    public Pregunta(String afirmacion, boolean esCierto, int dificultad) {
        this.afirmacion = afirmacion;
        this.esCorrecto = esCierto;
        this.dificultad = dificultad;
    }

    public String getAfirmacion() {
        return afirmacion;
    }

    public boolean esCorrecto() {
        return esCorrecto;
    }

    public int getDificultad() {
        return dificultad;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "afirmacion='" + afirmacion + '\'' + ", esCierto=" + esCorrecto + ", dificultad=" + dificultad + '}';
    }
}
