/**
 * Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
 * Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
 * Hacer un programa que calcule e imprima la cantidad de
 * dinero que tienen entre los tres
*/
package company;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Mostrar la cantidad de dinero\n");
    
    System.out.println("Ingrese la cantidad de Dolares que tiene Guillermo");
    double n = entrada.nextDouble();
    
    double resultado = 9*n/4;
    System.out.println("La cantidad de dinero es " + resultado);
  }
  
}
