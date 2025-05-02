/**
 * Crear y cargar una matriz de tamano nxm. Mostrar la suma de cada fila
 * y cada columna.
 */
package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej005 {

  // A nivel de clase
  // Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    int matriz[][], nFilas, nCol;
    nFilas = leerNumero("Ingrese el numero de filas");
    nCol = leerNumero("Ingrese el numero de columnas");
    
    matriz = new int[nFilas][nCol];
    
    agregarElementos(matriz, nFilas, nCol);
    mostrarMatriz(matriz, nFilas, nCol);
    
  }

  // Agregar elementos a la matriz
  public static void agregarElementos(int matriz[][], int nFilas, int nCol) {
        
    matriz = new int[nFilas][nCol];
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nCol; j++) {
        matriz[i][j] = i + j;
      }
    }
  }

  // Leer numero para filas y columnas
  public static int leerNumero(String mensaje) {
    int numero;
    numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    return numero;
  }
  
  public static void mostrarMatriz(int matriz[][], int nFilas, int nCol){
    System.out.println("Mostrando matriz");
    for (int i=0; i<nFilas; i++) {
      for (int j=0; j<nCol; j++) {
        System.out.print(matriz[i][j] + "  ");
      }
      System.out.println("");
    }
  }
}
