/**
 * Ejercicio 8: Construir un programa que calcule y muestre por pantalla las
 * raíces de la ecuación de segundo grado de coeficientes reales. ax^2+bx+c=0
 */
package company;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej08 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese el valor de a: ");
    int a = scanner.nextInt();
    
    System.out.print("Ingrese el valor de b: ");
    int b = scanner.nextInt();
    
    System.out.print("Ingrese el valor de c: ");
    int c = scanner.nextInt();
    
    if (a==0) {
      System.out.println("No es una ecuacion de segundo grado");
    } else {
      // calculamos el discriminante
      int discriminante = b*b - 4*a*c;
      
      // dependiendo de la discriminante determinamos las raices
      if (discriminante > 0) {
        double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
        double x2= (-b - Math.sqrt(discriminante)) / (2*a);
        System.out.println("Las raices reales son: x1 = " + x1+" y x2 = " + x2);
      
      } else if (discriminante == 0) {
        int x = -b / (2*a);
        System.out.println("Las raices son reales e iguales. x = " + x);
      
      } else {
        // en caso de raices complejas
        double parteReal = -b / (2*a);
        double parteImaginaria = Math.sqrt( -discriminante / (2*a));
        System.out.println("Las raices complejas son: \nx1 = " + parteReal +
          parteImaginaria + "i" + "\nx2 = " + parteReal + parteImaginaria+ "i");
      }
    }
  }
}
