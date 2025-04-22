/**
 * Recibir 5 numeros, guardarlos y mostrarlos en orden inverso
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej002 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    double numeros[] = new double[5];
    
    System.out.println("Ingresar los elementos del array");
    for (int i=0; i<5; i++) {
      System.out.println("Ingrese elemento " + (i+1) + ": ");
      numeros[i] = scanner.nextDouble();
    }
    
    System.out.println("Mostrando elementos en forma inversa");
    for (int i=4; i>=0; i--) {
      System.out.println(numeros[i] + " ");
    }
  }
}
