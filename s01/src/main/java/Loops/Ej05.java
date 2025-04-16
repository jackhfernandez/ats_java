/**
 * Pedir numeros hasta que se ingrese cero. Calcular la media
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej05 {
  
  public static void main(String[] args) {
    
    int numero, contador=0, suma=0; float media=0;
    
    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
   
    do {
      contador++;
      suma +=numero;
      numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
    } while (numero !=0);
    
    if (contador == 0) {
      System.out.println("Error. Division por cero");
      
    } else {
      media = (float) suma/contador; 
      System.out.println("La media es " + media);
    }    
  }
}
