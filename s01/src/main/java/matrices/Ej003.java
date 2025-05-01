/**
 * Crear y cargar una matriz de 3X3 transponerla y mostrarla
 */
package matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej003 {
  
  public static void main(String[] args) {
    
    int matriz[][] = {}, nFilas, nCol, k=0;
    
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
    nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
    
    matriz = new int[nFilas][nCol];
    
    // Agregando elementos y mostrando
    System.out.println("Mostrando matriz");
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        matriz[i][j] = k++;
        System.out.print(matriz[i][j] + "  ");
      }
      System.out.println("");
    }
    
    // Mostrando matriz
    System.out.println("\nMostando matriz transpuesta");
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        System.out.print(matriz[j][i] + "  ");
      }
      System.out.println("");
    }
  }
}
