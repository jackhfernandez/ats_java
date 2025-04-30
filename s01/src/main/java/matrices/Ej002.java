/**
 * Crear y cargar dos matrices de 3X3. Sumarlas y mostrar su suma
 */
package matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej002 {
  
  public static void main(String[] args) {
    
    int matriz1[][] = {},  matriz2[][] = {}, nFilas, nCol, suma=0, k=0;
    
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
    nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
    
    matriz1 = new int[nFilas][nCol];
    matriz2 = new int[nFilas][nCol];
    
    // Agregando elementos
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        matriz1[i][j] = i+j;
        matriz2[i][j] = i+j;
      }
    }
    
    // Mostrando matriz1
    System.out.println("\nMostrando matriz1");
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        System.out.print(matriz1[i][j] + "  ");
      }
      System.out.println("");
    }
    
    // Mostrando matriz2
    System.out.println("\n\nMostrando matriz2");
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        System.out.print(matriz2[i][j] + "  ");
      }
      System.out.println("");
    }
    
    // Sumando matrices
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        suma += matriz1[i][j] + matriz2[i][j];
      }
    }
    
    System.out.println("\nLa suma es " + suma);
  }
}
