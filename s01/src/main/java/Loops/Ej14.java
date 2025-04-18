/**
 * Pedir un numero entre 0 - 10 y mostrar su multiplicacion
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej14 {
  
  public static void main(String[] args) {
    int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entre 0-10: "));
    
    while (n != 0) {
      if (n<0 || n>10) { 
      JOptionPane.showMessageDialog(null, "Error! el numero debe estar entre 0-10");
      } else {
        for (int i=0; i<=12; i++) {
          System.out.println(n + " * " + i + " = " + n*i);
        }
      }
      n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entre 0-10: "));
    }
  }
}
