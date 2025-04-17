/**
 * Pedir un numero y calcular su factorial
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej10 {
  public static void main(String[] args) {
    int n, f=1;
    n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    
    for (int i=1; i<=n; i++) {
      f*=i;
    }
    
    JOptionPane.showMessageDialog(null, "Factorial de " + n + " es " + f);
  }
}
