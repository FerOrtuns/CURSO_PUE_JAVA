package curso.poo.trivial_v1_funcionalidades_extra;

public class Pregunta implements Comparable<Pregunta> {

    private String afirmacion;
    private boolean esCorrecto = true;
    private int dificultad;

    public Pregunta() {
    }

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

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "afirmacion='" + afirmacion + '\'' + ", esCierto=" + esCorrecto + ", dificultad=" + dificultad + '}';
    }

    @Override
    public int compareTo(Pregunta o) {
        return Integer.compare(this.getDificultad(), o.dificultad);
    }

}
