/**
 * Pedir numeros hasta que se teclee 0. Mostrar la suma de los numeros
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej04 {
  
  public static void main(String[] args) {
  
    int numero, suma=0;
    
    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    
    do {
      suma += numero;
      numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
    } while ( numero != 0);
    
    System.out.println("La suma de estos numeros es " + suma);
  }
}
