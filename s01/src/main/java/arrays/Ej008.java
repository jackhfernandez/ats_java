/**
 * Ejercicio 8: Diseñar una aplicación que declare una tabla de 10 elementos
 * enteros. Leer mediante el teclado 8 números. Después se debe pedir un número
 * y una posición, insertarlo en la posición indicada, desplazando los que 
 * estén detrás.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej008 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int[] arreglo = new int[10];
    
    // Dar 8 elementos
    for (int i=0; i<8; i++) {
      arreglo[i] = i+1;
    }
    System.out.println("Arreglo con solo 8 elementos");
    
    // Mostrar el arreglo con solo 8 elementos
    for (int arr : arreglo ) {
      System.out.print(arr+ " ");
    }
    
    // Pedir numero y posicion
    System.out.print("\nIngrese numero a insertar: ");
    int n = scanner.nextInt();
    
    System.out.print("Ingrese una posicion (0-9): ");
    int p = scanner.nextInt();
    
    if(p < 0 || p >9 ) {
      System.out.print("Ingrese una posicion valida (0-9): ");
    } else {
      // Desplazar elementos a la derecha
      for (int i=8; i>p;i--) {
        arreglo[i] = arreglo[i-1];
      }
      // Insertar el numero en la posicion indicada
      arreglo[p] = n;
      
      System.out.println("Arreglo resultante: ");
      for (int arr : arreglo) {
        System.out.print(arr + " ");
      }
    }
  }
}