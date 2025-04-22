/**
 * Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden
 */
package arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej001 {
  public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[5];
     
    for (int i=0; i<5; i++) {
      numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese elemento " + (i+1)));
    }
    
    for (int numero : numeros) {
      System.out.print(numero + " ");
    }
  }
}
