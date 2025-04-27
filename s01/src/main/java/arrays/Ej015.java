/**
 * Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar
 * (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */
package arrays;

/**
 *
 * @author jackh
 */
public class Ej015 {

  public static void main(String[] args) {

    //int[] arreglo1 = new int[10];
    //int[] arreglo2 = new int[10];
    int[] arreglo3 = new int[20];
    boolean creciente1 = true;
    boolean creciente2 = true;
    int j = 0;

    int[] arreglo1 = {1, 2, 5, 8, 9, 13, 19, 166, 199, 200};
    int[] arreglo2 = {3, 4, 6, 12, 16, 150, 250, 310, 450, 500};
    
    do {
      // Agregar elementos a los arreglos
      /*for (int i = 0; i < 10; i++) {
        arreglo1[i] = j += 1;
        arreglo2[i] = j += 2;
      }*/
      
      // Comprobar si arreglo esta ordenado
      for (int i=0; i<9; i++) {
        // Comprobar si arreglo1 esta ordenado
        if (arreglo1[i] < arreglo1[i+1]) {
          creciente1 = true;
        }
        if (arreglo1[i] > arreglo1[i+1]) {
          creciente1 = false;
          break;
        }
        
        // Comprobar si arreglo2 esta ordenado
        if (arreglo2[i] < arreglo2[i+1]) {
          creciente2 = true;
        }
        if (arreglo2[i] > arreglo2[i+1]) {
          creciente2 = false;
          break;
        }
      }
      
      if (creciente1 == false || creciente2 == false) {
        System.out.println("No esta ordenado en forma creciente. "
          + "\nIntentelo nuevamente");
      }
    } while (creciente1 == false || creciente2 == false);

    System.out.println("Arreglo 1: ");
    for (int arr : arreglo1) {
      System.out.print(arr + " ");
    }

    System.out.println("\n\nArreglo 2: ");
    for (int arr : arreglo2) {
      System.out.print(arr + " ");
    }

    // Combinar arreglos en uno solo de forma ordenada
    int k=0, l=0, m=0;
    while (k < arreglo1.length && l < arreglo2.length) {
      if (arreglo1[k] <  arreglo2[l]) {
        arreglo3[m] = arreglo1[k];
        k++;
      } else {
        arreglo3[m] = arreglo2[l];
        l++;
      }
      m++;
    }
    
    // Copiar elementos restantes del arreglo1 si los hay
    while (k<arreglo1.length) {
      arreglo3[m] = arreglo1[k];
      k++;
      m++;
    }
    
    // Copiar elementos restantes del arreglo2 si los hat
    while (l<arreglo2.length) {
      arreglo3[m] = arreglo2[l];
      m++;
      l++;
    }
    
    System.out.println("\nMostrando arreglo3 combinado: ");
    for (int arr : arreglo3) {
      System.out.print(arr + " ");
    }
  }
}