/**
 * Mostrar el producto de los 10 primeros numeros impares
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej09 {
  
  public static void main(String[] args) {

    int prod=1;
    
    for (int j=1; j<20; j+=2) {
      System.out.print(j + " ");
      prod *= j;
    }
    
    JOptionPane.showMessageDialog(null, "Producto: " + prod);
  }
}
