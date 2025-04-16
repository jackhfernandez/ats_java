/**
 * Pedir un numero N. Mostrar los numeros desde 1 hasta N
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej06 {
  
  public static void main(String[] args) {
  
    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    
    for (int i=0; i<=n; i++) {
      System.out.print(i + " ");
    }
  }
}
