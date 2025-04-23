/**
 * Pedir 10 numeros enteros como elementos para un array A y B
 * Mezclarlas en un tercer array: el 1ro de A, el 1ro de B, el segundo de A,
 * el segundo de B, etc
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej005 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    // Declarando array a y b
    int[] a = new int[10]; int[] b = new int[10]; int[] c = new int[20];
    
    // Pedir elementos
    System.out.println("Ingrese elementos para los arrays: ");
    for (int i=0; i<10; i++) {
      System.out.print("Ingrese elemento " + (i+1) + "del array A: ");
      a[i] = scanner.nextInt();
      System.out.print("Ingrese elemento " + (i+1) + "del array B: ");
      b[i] = scanner.nextInt();
    }
    
    // Creando un tercer array con los elementos del array a y b
    for (int i=0; i<10; i++) {
      c[i] = a[i];
      c[i+1] = b[i];
    }
    
    // Mostrando tercer array
    for (int i=0; i<20; i++) {
      System.out.print(c[i] + " ");
    }
  }
  
}
