/**
 * Pedir 10 numeros, guardarlos en un arreglo. Mostrar el primero, el ultimo,
 * el segundo, el penultimo, etc
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej004 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int[] numeros = new int[10];
    
    // Pedir los elementos al usuario
    System.out.println("Ingresar los elementos del array: ");
    for (int i=0; i<numeros.length; i++) {
      System.out.print("Elemento " + (i+1) + ": ");
      numeros[i] = scanner.nextInt();
    }
    
    // Mostrar los elementos en el orden solicitado
    for (int i=0; i< numeros.length / 2; i++) {
      System.out.print(numeros[i] + " ");
      System.out.print(numeros[numeros.length - 1 - i]+ " ");
    }
    
    scanner.close();
  }
}
