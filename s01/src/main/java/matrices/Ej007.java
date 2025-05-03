/**
 * Crear un arreglo de n elementos. Pedir al usuario dos posiciones
 * del arreglo e intercambiar de posicion
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej007 {
  
  // Scanner
  static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    int nElementos, vector[] = {};
        
    nElementos = pedirNumero("Ingrese tamano: ");
    
    vector = new int[nElementos];
    
    agregarElementos(nElementos, vector);
    mostrarVector(vector);
    cambiarPosicion(vector);
    mostrarVector(vector);
    
    
  }
  
  // Pedir tamano del vector
  public static int pedirNumero(String mensaje){
    int numero;
    System.out.print(mensaje);
    numero = scanner.nextInt();
    return numero;
  }
  
  // Agregar elementos
  public static void agregarElementos(int nElementos, int vector[]){
    for (int i=0; i<nElementos; i++){
      vector[i] = (int) (Math.random()*9)+1;
    }
  }
  
  // Mostrar Vector
  public static void mostrarVector(int vector[]){
    System.out.print("\nMostrando vector: ");
    for (int vec : vector){
      System.out.print(vec + "  ");
    }
  }
  
  // Cambiar la posicion de dos elementos
  public static void cambiarPosicion(int vector[]){
    int pos1, pos2, aux;
    pos1 = pedirNumero("\n\nIngrese una posicion: ");
    pos2 = pedirNumero("\nIngrese otra posicion: ");
    
    aux = vector[pos1];
    vector[pos1] = vector[pos2];
    vector[pos2] = aux;
  }
}
