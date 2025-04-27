/**
 * Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
 * Se debe mostrar la posición en que se encuentra.
 * Si no está, indicarlo con un mensaje.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej016 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int[] arreglo = new int[10];
    int numero;
    boolean creciente = true;
    
    do {
      // Pedir elementos
      for (int i=0; i<10; i++) {
        //arreglo[i] = (i+1);
        arreglo[i] = scanner.nextInt();
      }
      
      // Verificar que este ordenado
      for (int i=0; i<9; i++) {
        if (arreglo[i] < arreglo[i+1]) {
          creciente = true;
        }
        if (arreglo[i] > arreglo[i+1]) {
          creciente = false;
          break;
        }
      }
      
      if (creciente == false) {
        System.out.println("No esta ordenado en forma creciente"
            + "\nIntentelo de nuevo.");
      }
      
    } while (creciente == false);
    
    System.out.println("Mostrando arreglo: ");
    for (int arr : arreglo) {
      System.out.print(arr + " ");
    }
    
    // Pedimos el numero 
    System.out.print("\nIngrese N: ");
    numero = scanner.nextInt();
    
    // Buscamos el numero en el arreglo
    int i=0;
    while (i < 10 && arreglo[i] < numero) {
      i++;
    }
    
    if (i==10) {
      System.out.println("\nNumero no encontrado");
    } else {
      if (arreglo[i] == numero) {
        System.out.println("Numero " + numero + " encontrado, en la posicion " + i);
      } else {
        System.out.println("Numero no encontrado");
      }
    }
    
    
  }
}