/**
 * Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de medida de
 * masa, mostrar en pantalla un menú con las opciones posibles.
 */
package conditionals;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej03 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    double kg;
    
    System.out.println("Ingrese la cantidad en kg: ");
    kg = scanner.nextDouble();
    
    System.out.println("Seleccione la unidad a la que desea convertir: ");
    System.out.println("1. Gramos (g)");
    System.out.println("2. Libras (lb)");
    System.out.println("3. Toneladas (t)");
    System.out.println("Opcion: ");
    int opcion = scanner .nextInt();
    
    switch (opcion) {
      case 1:
        System.out.println(kg + " kg son " + kg * 1000 + " gramos");
        break;
      case 2:
        System.out.println(kg + " kg son " + (kg * 2.20462) + " toneladas.");
        break;
      case 3:
        System.out.println(kg + " kg son " + (kg /1000) + " toneladas.");
        break;
      default:
        System.out.println("Opcion invalida");
    }
    
    scanner.close();
    
  }
  
}
