/**
 * Hacer un programa que calcule el cuadrado de una suma
 *  (a+b)^2 = a^2 + 2ab + b^2
 */
package company;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Entrada de datos
    System.out.print("Ingrese a: ");
    int a = scanner.nextInt();
    
    System.out.print("Ingrese b: ");
    int b = scanner.nextInt();
    
    // Proceso
    int resultado = (a*a + b*b + 2*a*b);
    
    // salida
    System.out.println("El cuadrado de la suma es: " + resultado);

  }
}
