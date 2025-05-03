/**
 * Crear una matriz “marco” de tamaño 5x5: todos sus elementos deben ser O
 *  salvo los de los bordes que deben ser 1. Mostrarla.
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
