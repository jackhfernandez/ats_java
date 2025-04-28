/**
 * Ordenamiento con el metodo burbuja
 */
package sorting;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Bubble {
  
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
    
    int arreglo[], nElementos, aux;
    
    nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano del arreglo: "));
    
    arreglo = new int[nElementos];
    
    for (int i=0; i<nElementos; i++) {
      System.out.print("Ingrese elemento " + (i+1) + ": ");
      arreglo[i] = scanner.nextInt();
    }
    
    System.out.println("Mostrando arreglo original: ");
    for (int arr : arreglo) {
      System.out.print(arr + " ");
    }
    
    // Metodo burbuja
    for (int i=0; i<(nElementos-1); i++) {
      for (int j=0; j<(nElementos-1); j++) {
        if (arreglo[j] > arreglo[j+1]) {
          aux          = arreglo[j];
          arreglo[j]   = arreglo[j+1];
          arreglo[j+1] = aux;
        }
      }
    }
    
    System.out.println("\nMostrando arreglo ordenado: ");
    for (int i=0; i<nElementos; i++) {
      System.out.print(arreglo[i] + " ");
    }
    
    scanner.close();
  }
}