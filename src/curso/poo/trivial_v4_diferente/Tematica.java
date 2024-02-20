package curso.poo.trivial_v4_diferente;

import java.util.List;

public class Tematica {

    private Categoria categoria;
    private List<Pregunta> preguntas;

    public Tematica(Categoria categoria, List<Pregunta> preguntas) {
        this.categoria = categoria;
        this.preguntas = preguntas;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void agregarPregunta(String enunciado, String respuesta, int dificultad){
        Pregunta pregunta = new Pregunta(enunciado, respuesta, dificultad);
        preguntas.add(pregunta);
    }



}
