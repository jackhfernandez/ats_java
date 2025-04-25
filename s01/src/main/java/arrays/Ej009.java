/**
 * Crear un programa que reciba 10 numeros enteros y los guarde en un arreglo
 * mostrar el arreglo moviendo una posicion a los elementos es decir. el primer
 * elemento en la segunda posicion, el segundo en el tercero... y el ultimo 
 * en la primera posicion
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej009 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int[] arreglo = new int[10];
    
    for (int i=0; i<10; i++) {
      arreglo[i] = (i+1);
    }
    
    System.out.println("Arreglo original: ");
    for (int arr : arreglo) {
      System.out.print(arr + " ");
    }
    
    int ultimo = arreglo[9];
    
    for (int i=8; i>=0; i--) {
      arreglo[i+1] = arreglo[i];
    }
    
    arreglo[0] = ultimo;
    
    System.out.println("\nArreglo modificado: ");
    for (int arr : arreglo ) {
      System.out.print(arr + " ");
    }
  }
}
