/**
 * Utilizando dos matrices de 5x9 y 9x5. cargar la primera y transponerla
 * en la segunda
 */
package matrices;

/**
 *
 * @author jackh
 */
public class Ej006 {
  
  public static void main(String[] args) {
    
    int matriz[][] = new int[5][9];
    int matriz2[][] = new int[9][5];
    
    agregarElementos(matriz);
    mostrarMatriz(matriz);
    transponer(matriz, matriz2);
    mostrarMatrizTranspuesta(matriz2);
    
  }
  
  public static void agregarElementos(int matriz[][]){
    for (int i=0; i<5; i++){
      for (int j=0; j<9; j++){
        matriz[i][j] = (int) (Math.random() *9 ) + 1;
      }
    }
  }
  
  public static void mostrarMatriz(int matriz[][]){
    System.out.println("Matriz original");
    for (int i=0; i<5; i++){
      for (int j=0; j<9; j++){
        System.out.print(matriz[i][j] + "  ");
      }
      System.out.println("");
    }
  }
  
  public static void transponer(int matriz[][], int matriz2[][]){
    for (int i=0; i<5; i++){
      for (int j=0; j<9; j++){
        matriz2[j][i] = matriz[i][j];
      }
    }
  }
  
  public static void mostrarMatrizTranspuesta(int matriz2[][]){
    System.out.println("\n\nMostrando matriz transpuesta");
    for (int i=0; i<9; i++){
      for (int j=0; j<5; j++){
        System.out.print(matriz2[i][j] + "  ");
      }
      System.out.println("");
    }
  }
}
