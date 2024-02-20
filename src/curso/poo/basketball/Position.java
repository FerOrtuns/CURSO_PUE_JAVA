package curso.poo.basketball;

public enum Position {

    BASE(1), ESCOLTA(2), ALERO(3), ALA_PIVOT(4), PIVOT(5);

    private final int valor;

    Position(int valor) {
        this.valor = valor;
    }

}
