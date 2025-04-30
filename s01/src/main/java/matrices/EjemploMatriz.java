/**
 * Ejemplo matrices
 */
package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class EjemploMatriz {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
   
    int matriz[][], nCol, nFilas;
    
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
    nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas: "));
    
    matriz = new int[nFilas][nCol];
    
    // Ingresar elementos
    System.out.println("Ingrese elementos al arreglo");
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        System.out.print("Matriz["+i+"]["+j+"] :");
        matriz[i][j] = scanner.nextInt();
      }
    }
    
    // Mostrando arreglo
    System.out.println("\nMostrando matriz");
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("");
    }
  }
}
