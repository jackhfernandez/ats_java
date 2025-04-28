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
      arreglo[i] = scanner.nextInt();
    }
    
    // Metodo burbuja
    
  }
}
