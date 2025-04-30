/**
 * Busqueda binaria
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author jackh
 */
public class BusquedaBinaria {
  
  public static void main(String[] args) {
    int[] arreglo = {2, 4, 7, 17, 34, 1343,39};
    int posicion, elementoBuscar = 20;
    
    // Mostrar arreglo
    System.out.println("Mostrando arreglo");
    for (int arr : arreglo) {
      System.out.print(arr + " ");
    }
    
    // Ordenar el arreglo
    Arrays.sort(arreglo);
    
    // Mostrar arreglo ordenado
    System.out.println("\nArreglo Ordenado");
    for (int arr : arreglo) {
      System.out.print(arr + " ");
    }
    
    // Busqueda binaria
    posicion = Arrays.binarySearch(arreglo, elementoBuscar);
    
    if (posicion >= 0) {
      System.out.println("\nElemento se encuenta en la posicion " + posicion);
    } else {
      System.out.println("\nElemento no encontrado");
    }
  }
}
