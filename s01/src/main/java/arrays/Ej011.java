/**
 * Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
 * Estos los guardaremos en una tabla de tamaño 10. Leer un número N, e
 * insertarlo en el lugar adecuado para que la tabla continúe ordenada.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej011 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arreglo = new int[10];
    
    for (int i=0; i<5; i++) {
      arreglo[i] = (i+1);
    }
    
    
  }
}
