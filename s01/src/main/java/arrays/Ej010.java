/**
 * Crear un programa que lea por teclado una tabla de 10
 * números enteros y desplace N posiciones en el arreglo
 * (N es digitado por el usuario).
 */ 
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej010 {
  public static void main(String[] args) {
    int[] arreglo = new int[10];
    int[] resultado = new int[10];
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("\nIngresa el numero a desplazar (1-10): ");
    int n = scanner.nextInt();
    while (n<0 || n>=10) {
      if (n<0 || n>=10) {
        System.out.print("\nIngresa un numero valido: ");
        n = scanner.nextInt();
      }
    }
    
    for (int i=0; i<10; i++) {
      arreglo[i] = (i+1);
    }
    
    System.out.println("Arreglo original: ");
    for (int arr : arreglo) {
      System.out.print(arr + " ");
    }
    
    // Desplazar el arreglo n posiciones
    for (int i=0; i<10; i++) {
      resultado[(i+n) % arreglo.length] = arreglo[i];
    }
    
    System.out.println("\nArreglo desplazado " + n + " posicion(es)");
    for (int res : resultado) {
      System.out.print(res + " ");
    }
  }
}