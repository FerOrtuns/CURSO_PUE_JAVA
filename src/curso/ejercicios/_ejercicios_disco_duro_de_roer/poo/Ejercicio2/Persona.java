package curso.ejercicios._ejercicios_disco_duro_de_roer.poo.Ejercicio2;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private int dni;
    private static final char sexo = 'H';
    private double peso = 0.0;
    private double altura = 0.0;

    public Persona() {
        this("", 0, 0, 0, sexo);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, 0, 0, sexo);
    }

    public Persona(String nombre, int edad, double peso, double altura, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(sexo);
        generarDNI();
        esMayorDeEdad(edad);
    }

    public String calcularIMC() {

        double formulaCalcularPeso = peso / (altura * altura) * 1000;
        String formula = String.format("%.2f", formulaCalcularPeso);

        if (formulaCalcularPeso < 20) {

            return "Estas en tu peso ideal, tu imc es " + formula + ", (0)";

        } else if (formulaCalcularPeso >= 20 && formulaCalcularPeso <= 25) {

            return "Estas por debajo de tu peso ideal, tu imc es " + formula + ", (-1)";

        } else if (formulaCalcularPeso > 25) {

            return "Estas por encima de tu peso ideal, tu imc es " + formula + ", (1)";

        }

        return formula;
    }

    public boolean esMayorDeEdad(int edad) {

        return edad >= 18;

    }

    public char comprobarSexo(char sexo) {

        if (sexo != 'M' && sexo != 'H') {
            sexo = Persona.sexo;
        }

        return sexo;

    }

    public String generarDNI() {

        int dni = 70872155;

        int resto = dni % 23;
        char[] letrasDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return String.valueOf((dni) + "-" + (letrasDni[resto]));

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + generarDNI() + '\'' +
                ", sexo='" + comprobarSexo(sexo) + '\'' +
                ", ¿Es mayor de edad?='" + esMayorDeEdad(edad) + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", IMC= " + calcularIMC() +
                '}';
    }

}
