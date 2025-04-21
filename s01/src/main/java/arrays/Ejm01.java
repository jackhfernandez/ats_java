/**
 * Ejemplo array con caracteres ingresados por el usuario
 */
package arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ejm01 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos: "));
    
    
    char[] texto = new char[nElementos];
    
    System.out.println("Ingrese los caracteres: ");
    for (int i=0; i<nElementos; i++) {
      System.out.print((i+1) + " Digite un caracter: ");
      texto[i] = scanner.next().charAt(0);
    }
    
    System.out.println("Los caracteres del arreglo son: ");
    for (int i=0; i<nElementos; i++) {
      System.out.print(texto[i] + " ");
    }
  }
}
