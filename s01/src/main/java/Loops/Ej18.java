/**
 * Pedir 10 numeros y al final mostrar si se ha ingresado uno negativo
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej18 {
  public static void main(String[] args) {
    boolean numero = false; int n, contador=0;
    for (int i=0; i<10; i++) {
      n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      if (n<0) {
        numero = true;
        contador++;
      }
    }
    
    if ( numero == true ) {
      JOptionPane.showMessageDialog(null, "Hay " + contador + " numero(s) negativos");
    } else {
      JOptionPane.showMessageDialog(null, "No hay numero(s) negativos");
    }
  }
}
