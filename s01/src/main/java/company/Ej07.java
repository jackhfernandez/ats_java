/**
 * Ejercicio 7: Construir un programa que, dado un número total de horas,
 * devuelve el número de semanas, días y horas equivalentes. Por ejemplo,
 * dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 */
package company;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese el total de horas: ");
    int totalHoras = scanner.nextInt();
    
    int semanas, dias, horas;
    
    semanas = totalHoras / 168;
    dias    = totalHoras % 168 / 24;
    horas   = totalHoras % 24;
    
    System.out.println("EL equivalente es: ");
    System.out.println("Semanas: " + semanas);
    System.out.println("Dias   : " + dias);
    System.out.println("Horas  : " + horas);
  }
}
