package curso.poo.trivial_v2_tematicas;

public class Pregunta implements Comparable<Pregunta> {

    private String afirmacion;
    private boolean esCorrecto = true;
    private int dificultad;
    private Tematica tematica;

    public Pregunta() {
    }

    public Pregunta(String afirmacion, boolean esCierto, int dificultad, Tematica tematica) {
        this.afirmacion = afirmacion;
        this.esCorrecto = esCierto;
        this.dificultad = dificultad;
        this.tematica = tematica;
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

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "afirmacion='" + afirmacion + '\'' + ", esCorrecto=" + esCorrecto + ", dificultad=" + dificultad + ", tematica=" + tematica + '}';
    }

    @Override
    public int compareTo(Pregunta o) {
        return Integer.compare(this.getDificultad(), o.dificultad);
    }

}
