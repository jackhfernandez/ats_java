/**
 * Crear y cargar una matriz de n * m y determinar si es simetrica o no
 */
package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej001 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int matriz[][] = {}, nFilas, nCol;
    boolean simetrica = true;
    
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
    nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas: "));
    
    matriz = new int[nFilas][nCol];
    
    // Agregando elementos
    System.out.println("Agregue elementos a la matriz: ");
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        System.out.print("Matriz["+i+"]["+j+"]"+": ");
        matriz[i][j] = scanner.nextInt();
      }
    }
    
    // Mostrando matriz
    System.out.println("\nMostrando matriz");
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        System.out.print(matriz[i][j] + "   ");
      }
      System.out.println("");
    }
    
    // Verificar si la matriz es simetrica
    if (nFilas == nCol) {
      int i, j;
      i=0;
      while (i<nFilas && simetrica == true) {
        j=0;
        while (j < i && simetrica ==  true) {
          if (matriz[i][j] != matriz[j][i]) {
            simetrica = false;
          }
          j++;
        }
        i++;
      }
      
      if (simetrica == true) {
        JOptionPane.showMessageDialog(null, "\nLa matriz es simetrica");
      } else {
        JOptionPane.showMessageDialog(null, "\nLa matriz no es simetrica");
      }
    } else {
      JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
    }
    
  }
}
