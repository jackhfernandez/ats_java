/**
 * Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene
 */
package conditionals;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej02 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese un numero entre 0 y 99999: ");
    int num = scanner.nextInt();
    
    if (num < 0 || num > 99999) {
      System.out.println("El numero esta fuera del rango");
    } else {
      int cifras = String.valueOf(num).length();
      System.out.println("Cantidad de cifras: " + cifras);
    }
    
  }
  
}
