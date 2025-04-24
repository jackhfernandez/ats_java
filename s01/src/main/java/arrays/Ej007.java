/**
 * Leer 10 numeros por teclado indicar si 
 * los numeros estan ordenados en forma creciente, decreciente o desordenado
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej007 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int[] array1 = new int[10];
    int[] array2 = new int[10];
    int[] array3 = new int[10];
    
    // Completar el arreglo: ascendente
    for (int i=0; i<10; i++) {
      array1[i] = i+1;
    }
   
    // Completar arreglo: descendente
    int j=0;
    for (int i=9; i>=0; i--) {
      array2[j] = i+1;
      j++;
    }
    
    // Completar el arreglo: desordenado
    Random random = new Random();
    for (int i=0; i<10; i++) {
      array3[i] = random.nextInt(10) + 1; // Genera numeros entre 1 y 10
    }
    
    // Completar arreglo con elementos iguales
    int[] array4 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

    // Verificar arreglo
    boolean ascendente=false, descendente=false;
    
    for (int i=0; i<9; i++) {
      if (array3[i] > array3[i+1]) {
        descendente = true;
      }
      
      if (array3[i] < array3[i+1]) {
        ascendente = true;
      }
    }
    
    if ( descendente == true && ascendente == false ) {
      System.out.println("\nOrdenado de forma descendente!!!");
    } else if ( ascendente == true && descendente == false ) {
      System.out.println("\nOrdenado de forma ascendente!!!");
    }else if ( descendente == true && ascendente == true ) {
      System.out.println("\nArray desordenado!!!");
    } else if ( descendente == false && ascendente == false) {
      System.out.println("Array con elementos iguales");
    }
  }
}