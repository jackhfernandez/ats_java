/**
 * Dadas 6 notas escribir la cantidad de alumnos aprobados, condicionados (=4) 
 * y suspensos
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej16 {
  public static void main(String[] args) {
    float nota;
    int aprobados=0, condicionados=0, suspensos=0;
    
    for (int i=0; i<6; i++) {
      do {
        nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota: "));
      } while (nota <=1 || nota >=10);

      if (nota == 4 ) {
        suspensos++;
      } else if (nota >= 5 ){
        aprobados++;
      } else {
        suspensos++;
      }
    }
    
    System.out.println("Cantidad de aprobados: " + aprobados);
    System.out.println("Cantidad de condicionados: " + condicionados);
    System.out.println("Cantidad de suspensos: " + suspensos);
  }
}
