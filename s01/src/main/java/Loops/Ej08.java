/**
 * Pedir 10 numeros y mostrar la suma total
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej08 {
  
  public static void main(String[] args) {
    
    int suma = 0, numero;
    
    for (int i=0; i<10; i++) {
      numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      suma += numero;
    }
    
    System.out.println("La suma es " + suma);
  }
}
