/**
 * Pedir 5 calificaciones y mostrar si hay algun alumno suspenso
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej19 {
  public static void main(String[] args) {
    int nota;
    boolean suspenso = false;
    for (int i=1; i<=5; i++) {
      nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota " + i + ": "));
      
      if (nota < 4) {
        suspenso = true;
      }
    }
    
    JOptionPane.showMessageDialog(null, "Existe al menos un alumno suspenso");
  }
}
