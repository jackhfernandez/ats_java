/**
 * Crear y cargar una matriz de tamano nxm. Mostrar la suma de cada fila
 * y cada columna.
 */
package matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej005 {

  public static void main(String[] args) {

    int matriz[][], nFilas, nCol, sFilas=0, sCol=0;
    nFilas = leerNumero("Ingrese el numero de filas");
    nCol = leerNumero("Ingrese el numero de columnas");

    matriz = new int[nFilas][nCol];

    agregarElementos(matriz, nFilas, nCol);
    mostrarMatriz(matriz, nFilas, nCol);
    sumaFilas(matriz, nFilas, nCol, sFilas);
    sumaColumnas(matriz, nFilas, nCol, sCol);

  }

  // Agregar elementos a la matriz
  public static void agregarElementos(int matriz[][], int nFilas, int nCol) {

    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nCol; j++) {
        matriz[i][j] = (int) (Math.random() * 9) + 1;
      }
    }
  }

  // Leer numero para filas y columnas
  public static int leerNumero(String mensaje) {
    int numero;
    numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    return numero;
  }

  public static void mostrarMatriz(int matriz[][], int nFilas, int nCol) {
    System.out.println("Mostrando matriz");
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nCol; j++) {
        System.out.print(matriz[i][j] + "  ");
      }
      System.out.println("");
    }
  }

  // Sumar filas  
  public static void sumaFilas(int matriz[][], int nFilas,int nCol, int sFilas) {
    for (int i = 0; i < nFilas; i++) {
      sFilas=0;
      for (int j=0; j<nCol; j++){
        sFilas += matriz[i][j];
      }
      System.out.print("\nLa suma de la fila ["+i+"] es "+ sFilas);
    }
    System.out.println("");
  }
  
  // Sumar columnas
  public static void sumaColumnas(int matriz[][], int nCol, int nFilas, int sCol){
    for (int j=0; j<nCol; j++){
      sCol = 0;
      for (int i=0; i<nFilas; i++){
        sCol += matriz[i][j];
      }
      System.out.print("\nLa suma de la columna ["+j+"] es: "+ sCol);
    }
    System.out.println("");
  }
}
