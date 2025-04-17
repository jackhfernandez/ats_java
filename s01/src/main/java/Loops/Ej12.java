/**
 * Pedir 10 sueldos.
 * Mostrar su suma
 * Mostrar cuantos son mayores a 1000
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej12 {
  public static void main(String[] args) {
    double sueldo, sumaSueldo=0, mayorMil=0;
    
    for (int i=0; i<10; i++) {
      sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sueldo " +
               (i+1) + ": "));
      sumaSueldo += sueldo;
      if (sueldo > 1000) {
        mayorMil++;
      }
    }
    
    JOptionPane.showMessageDialog(null, "Sueldo total: " + sumaSueldo +
        "\nSueldo mayor a mil: " + (int)mayorMil);
  }
}
