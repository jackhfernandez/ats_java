/**
 * Ordenamiento por el metodo de insercion
 */
package sorting;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Insertion {
  
  public static void main(String[] args) {
    
    int[] arreglo = {};
    int nElementos, aux, posicion;
    
    nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos: "));
    
    arreglo = new int[nElementos];
    
    // Agregando elementos al arreglo
    for (int i=0; i<nElementos; i++) {
      arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese elemento " + (i+1) + ": "));
    }
    
    // Mostrando arreglo
    System.out.println("Mostrando arreglo: ");
    for (int arr : arreglo) {
      System.out.print(arr + " ");
    }
    
    // Ordenamiento por insercion
    for (int i=0; i<nElementos; i++) {
      posicion = i;
      aux = arreglo[i];
      
      while ((posicion>0) && (arreglo[posicion-1] > aux )) {
        arreglo[posicion] = arreglo[posicion-1];
        posicion--;
      }
      arreglo[posicion] = aux;
    }
    
    // Mostrando arreglo ordenado
    System.out.print("\n\nMostrando arreglo ordenadao - ascendente\n");
    for (int arr : arreglo ) {
      System.out.print(arr + " ");
    }
  }
}
