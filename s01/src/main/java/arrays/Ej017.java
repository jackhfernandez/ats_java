/**
 * Queremos desarrollar una aplicación que nos ayude a gestionar las notas de
 * un centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos.
 * Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
 * Debemos mostrar al final: la nota media del grupo en cada trimestre,
 * y la media del alumno que se encuentra en la posición N
 * (N se pide por teclado)
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej017 {
  
  public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        final int NUM_ALUMNOS = 5;
        final int NUM_TRIMESTRES = 3;

        // Matriz para almacenar las notas de los alumnos
        double[][] notas = new double[NUM_ALUMNOS][NUM_TRIMESTRES];

        // Leer las notas de los alumnos
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.println("Introduce las notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < NUM_TRIMESTRES; j++) {
                System.out.print("Nota del trimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Calcular y mostrar la nota media del grupo en cada trimestre
        for (int j = 0; j < NUM_TRIMESTRES; j++) {
            double sumaTrimestre = 0;
            for (int i = 0; i < NUM_ALUMNOS; i++) {
                sumaTrimestre += notas[i][j];
            }
            double mediaTrimestre = sumaTrimestre / NUM_ALUMNOS;
            System.out.println("Nota media del grupo en el trimestre " + (j + 1) + ": " + mediaTrimestre);
        }

        // Pedir la posición del alumno para calcular su media
        System.out.print("Introduce la posicion del alumno (1-" + NUM_ALUMNOS + "): ");
        int posicion = scanner.nextInt();

        if (posicion < 1 || posicion > NUM_ALUMNOS) {
            System.out.println("Posicion no válida.");
        } else {
            double sumaAlumno = 0;
            for (int j = 0; j < NUM_TRIMESTRES; j++) {
                sumaAlumno += notas[posicion - 1][j];
            }
            double mediaAlumno = sumaAlumno / NUM_TRIMESTRES;
            System.out.println("Nota media del alumno en la posicion " + posicion + ": " + mediaAlumno);
        }

        scanner.close();
    }
}