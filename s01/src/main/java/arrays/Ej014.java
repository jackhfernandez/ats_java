/**
 * Leer 10 enteros en una tabla. Guardar en otra tabla los
 * elementos pares de la primera, y a continuación los elementos impares.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej014 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int[] arreglo = new int[10];
    int[] pares = new int[5];
    int[] impares = new int[5];
    
    // Recibiendo elementos
    System.out.println("Ingrese elementos: ");
    for (int i=0; i<10; i++) {
      arreglo[i] = scanner.nextInt();
    }
    
    // almacenar en dos arrglos
    for (int i=0; i<10; i++) {
      if (arreglo[i] % 2 == 0 ) {
        pares[i] = arreglo[i]; 
      } else {
        impares[i] = arreglo[i];
      }
    }
    
    System.out.println("Mostrando arreglos: ");
    
    for (int par : pares ) {
      System.out.println(par + " ");
    }
    
    for (int impar : impares ) {
      System.out.println(impar + " ");
    }
  }
}
