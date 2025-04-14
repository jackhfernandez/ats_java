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

    int a=1;
    
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Ingrese un numero: ");
      a = scanner.nextInt();
      if (a<1) {
        System.out.println("");
      } else {
        System.out.println(a + "^2 = "+ a*a);
      }
    } while (a > 0);
  }
}
