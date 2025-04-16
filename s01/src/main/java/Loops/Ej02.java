/**
 * Pedir numeros hasta que se teclee uno negativo y mostrar cuantos 
 * numeros se han introducido
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej02 {
  
  public static void main(String[] args) {
    
    int i=0, num;
    
    num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    
    while ( num>0) {
      i++;
      System.out.println("se han ingresado " + i + " numeros");
      num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
    }
    
  }
  
}
