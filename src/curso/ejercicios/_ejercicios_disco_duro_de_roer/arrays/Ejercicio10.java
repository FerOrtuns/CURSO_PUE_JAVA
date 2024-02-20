package curso.ejercicios._ejercicios_disco_duro_de_roer.arrays;

/*
Crea un array de números y otro de String de 10 posiciones donde insertaremos notas entre 0 y 10 (debemos controlar que inserte una nota valida), pudiendo ser decimal la nota en el array de números, en el de Strings se insertaran los nombres de los alumnos. Después, crearemos un array de String donde insertaremos el resultado de la nota con palabras.
Si la nota esta entre 0 y 4,99 , sera un suspenso
Si esta entre 5 y 6,99 , sera un bien.
Si esta entre 7 y 8,99 sera un notable.
Si esta entre 9 y 10 sera un sobresaliente.
Muestra por pantalla, el alumno su nota y su resultado en palabras. Crea los métodos que creas conveniente.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

    private static Scanner sc = new Scanner(System.in);
    private static int size = 5;
    private static String[] nameArray = new String[size];
    private static double[] noteArray = new double[size];

    public static void main(String[] args) {
        enterData();
        showNote();
    }

    private static void enterData() {

        String studentName = "";
        boolean flag = false;

        for (int i = 0; i < nameArray.length; i++) {

            do {

                try {

                    System.out.println("Enter the student's name.");
                    studentName = sc.nextLine();

                    if (!studentName.matches("^[\\p{L}'-]{3,30}(?:[\\s.]+[\\p{L}'-]{3,30})*$")) {

                        System.out.println("The name must be between 3 and 30 letters long.");
                        flag = false;

                    } else {

                        nameArray[i] = studentName;
                        flag = true;

                    }

                } catch (InputMismatchException e) {
                    System.out.println("You can only enter letters, not numbers");
                    sc.nextLine();
                }

            } while (!flag);

        }

        double studentNote = 0;
        flag = false;

        for (int i = 0; i < noteArray.length; i++) {

            do {

                try {

                    System.out.println("Enter the note for the student's: " + nameArray[i]);
                    studentNote = sc.nextDouble();

                    if (studentNote < 0 || studentNote > 10) {

                        System.out.println("The note must be between 0 and 10.");
                        flag = false;

                    } else {

                        noteArray[i] = studentNote;
                        flag = true;

                    }

                } catch (InputMismatchException e) {
                    System.out.println("You can only enter numbers from 0 to 10 and not letters.");
                    sc.nextLine();
                }

            } while (!flag);

        }

    }

    private static void showNote() {

        String[] note = {"Fail", "good", "excelent", "outstanding"};

        for (int i = 0; i < size; i++) {

            if (noteArray[i] >= 0 && noteArray[i] < 5) {

                System.out.println("The student '" + nameArray[i] + "' has a note of: " + noteArray[i] + ". " + note[0]);

            } else if (noteArray[i] >= 5 && noteArray[i] < 7) {

                System.out.println("The student '" + nameArray[i] + "' has a note of: " + noteArray[i] + ". " + note[1]);

            } else if (noteArray[i] >= 7 && noteArray[i] < 9) {

                System.out.println("The student '" + nameArray[i] + "' has a note of: " + noteArray[i] + ". " + note[2]);

            } else if (noteArray[i] >= 9 && noteArray[i] <= 10) {

                System.out.println("The student '" + nameArray[i] + "' has a note of: " + noteArray[i] + ". " + note[3]);

            }

        }

    }

}
