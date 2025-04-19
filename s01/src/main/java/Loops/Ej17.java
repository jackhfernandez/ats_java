/**
 * Pedir un numero N, introducir N sueldos, mostrar el sueldo maximo
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej17 {
  public static void main(String[] args) {
    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    
    if (n <= 0) {
      JOptionPane.showMessageDialog(null, "El numero debe ser mayor que cero");
    }
    
    double maxSueldo = Double.MIN_VALUE;
    
    for (int i=1; i<=n; i++) {
      double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el sueldo "+i+ ": "));
      
      if (sueldo > maxSueldo) {
        maxSueldo = sueldo;
      }
    }
    
    JOptionPane.showMessageDialog(null, " El maximo sueldo es: " + maxSueldo);
  }
}
