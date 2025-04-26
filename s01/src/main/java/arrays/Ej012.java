/**
 *  Leer por teclado una tabla de 10 elementos numéricos enteros y una
 * posición (entre 0 y 9). Eliminar el elemento situado en la posición
 * dada sindejar huecos.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej012 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] arreglo = new int[10];
    int posicion;
    
    // Llenar el arreglo con enteros
    System.out.println("Ingrese 10 elementos: ");
    for (int i=0; i<10; i++) {
      arreglo[i] = scanner.nextInt();
    }
    
    do {
      System.out.println("Ingrese la posicion a eliminar (0 - 10): ");
      posicion = scanner.nextInt();
    } while (posicion < 0 || posicion > 9);
    
    // Eliminar elemento en la posicion sin dejar hueco
    for (int i=posicion; i<arreglo.length - 1; i++) {
      arreglo[i] = arreglo[i+1];
    }
    
    // Reducir el tamano logico del array
    // Mostrar arreglo modificado
    System.out.println("Arreglo modificado:");
    for (int i=0; i<arreglo.length-1; i++) {
      System.out.print(arreglo[i] + " ");
    }
  }
}
