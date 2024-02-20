package curso.poo.trivial_v4_diferente;

public class Pregunta {

    private String enunciado;
    private String respuesta;
    private int dificultad;

    public Pregunta(String enunciado, String respuesta, int dificultad) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.dificultad = dificultad;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public int getDificultad() {
        return dificultad;
    }
}
