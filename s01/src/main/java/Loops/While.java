/**
 * Programa para mostrar el cuadrado de un numero ingresado por el usuario
 * hasta que este ingrese un numero negativo
 */
package Loops;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class While {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    int a=0;
    a = scanner.nextInt();
          
    while (a > 0) {
      System.out.print("Ingrese un numero: ");
      a = scanner.nextInt();
      System.out.print(a + "^2 = "+ a*a);
    }
  }
}
