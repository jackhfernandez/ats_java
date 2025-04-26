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
    int numero, ubicacion=0, j=0; // numero a insertar en la variable
    boolean creciente = true;
    
    do {
      // llenando el arreglo
      System.out.println("Agregar elementos al arreglo: ");
      for (int i=0; i<5; i++) {
        arreglo[i] = scanner.nextInt();
      }
      
      // Comprobar si esta en orden creciente o decreciente
      for (int i=0; i<4; i++) {
        if (arreglo[i] < arreglo[i+1]) {
          creciente =  true;
        }
        
        if (arreglo[i] > arreglo[i+1]) {
          creciente = false;
          break;
        }
      }
      
      if ( creciente == false ) {
        System.out.println("El arreglo no esta ordenado en forma creciente, intentelo de nuevo");
      }
      
    } while ( creciente == false);
    
    System.out.print("Ingrese un elemento a insertar: ");
    numero = scanner.nextInt();
    
    // Ver en que posicion va el numero
    while ( arreglo[j] < numero && j<5 ) {
      ubicacion++;
      j++;
    }
    
    // trasladamos una posicion a los elementos que van detras de numero
    for (int i=4; i>=ubicacion; i--) {
      arreglo[i+1] = arreglo[i];
    }
    
    arreglo[ubicacion] = numero;
    
    // Mostrando el nuevo arreglo
    System.out.println("\nMostrando arreglo modificado: ");
    for (int arr : arreglo) {
      System.out.print(arr + " ");
    }
  }
}
