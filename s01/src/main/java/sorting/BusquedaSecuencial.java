/**
 * Busqueda secuencial
 */
package sorting;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class BusquedaSecuencial {
  
  public static void main(String[] args) {
    
    int[] arreglo = {4, 1, 5, 2, 3};
    int dato;
    boolean band = false;
    
    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar: "));
    
    // Busqueda secuencial
    int i=0;
    while (i<5 && band == false) {
      if (arreglo[i] == dato) {
        band = true;
      }
      i++;
    }
    
    if (band == false) {
      JOptionPane.showMessageDialog(null, "No se ha encontrado el numero en el arreglo");
    } else {
      JOptionPane.showMessageDialog(null, "Nro encontrado en la posicion "+(i-1));
    }
  }
}
