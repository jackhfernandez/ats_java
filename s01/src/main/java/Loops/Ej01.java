/**
 * Leer un numero e indicar si es positivo o negativo
 * repetir el proceso hasta que se introduzca el cero
 */
package Loops;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej01 {
  
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    int a=1;
    //System.out.println("Ingrese un numero: ");
    //int a = scanner.nextInt();
    
    while (a != 0) {
      System.out.print("Ingrese un numero: ");
      a = scanner.nextInt();
      if (a>0) {
        System.out.println("Es positivo");
      } else {
        System.out.println("Es negativo");
      }
    }
  }  
}
