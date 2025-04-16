/**
 * Adivina el numero. generar un num aleatorio entre 0 - 100 y sugerir el num
 * es mayor o menor con respecto al numero ingresado por el usuario. Al adivinar 
 * mostrar el numero de intentos
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej03 {
  public static void main(String[] args) {
    
    int numero, contador=0, aleatorio;
    
    aleatorio = (int)(Math.random()*100); //Genera numero aleatorio entre 0-100
    
    do {
      numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      
      if (aleatorio > numero) {
        System.out.println("Ingrese un numero mayor");
      } else {
        System.out.println("Ingrese un numero menor");
      }
      
      contador++;
       
    } while (numero != aleatorio);
    
    System.out.println("Muy bien, adivinaste con " + contador + " intento(s)"
        + "\nEl numero es " + numero);
  }
}
