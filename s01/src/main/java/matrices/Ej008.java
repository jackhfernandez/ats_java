/**
 * Crear y cargar una matriz de 10 elementos. Pedir al usuario dos posiciones
 * de la matriz e intercambiar de posicion
 */
package matrices;

/**
 *
 * @author jackh
 */
public class Ej008 {
  
  public static void main(String[] args) {
    
    int matriz[][] = new int[5][5];

    agregarElementos(matriz);
    mostrarMatriz(matriz);
    
  }
  
  // Agregar elementos 
  public static void agregarElementos(int matriz[][]){
    for (int i=0; i<5; i++){
      for (int j=0; j<5; j++){
        if (i == 0 || i == 4){
          matriz[i][j] = 1;
        } else if (j == 0 || j == 4) {
          matriz[i][j] = 1;
        } else {
          matriz[i][j] = 0;
        }
      }
    }
  }
  
  // Mostrando
  public static void mostrarMatriz(int matriz[][]){
    System.out.println("Mostrando matriz");
    for (int i=0; i<5; i++){
      for (int j=0; j<5; j++){
        System.out.print(matriz[i][j] + "  ");
      }
      System.out.println("");
    }
  }
}
