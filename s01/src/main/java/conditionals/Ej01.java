/**
 * Pedir tres numeros al usuario y mostrarlos ordenados de mayor a menor
 */
package conditionals;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej01 {
  
  public static void main(String[] args) {
    int n1, n2, n3;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese el primer  nro: ");
    n1 = scanner.nextInt();
    
    System.out.print("Ingrese el segundo nro: ");
    n2 = scanner.nextInt();
    
    System.out.print("Ingrese el tercer  nro: ");
    n3 = scanner.nextInt();
    
    if ((n1 > n2) && (n1>n3)) {
      System.out.println("Los numeros son: "+n1+" - "+n2+" - "+n3);
    } else if ((n1 > n3) && (n3>n2)) {
      System.out.println("Los numeros son: "+n1+" - "+n3+" - "+n2);
    } else if ((n2>n1) && (n1>n3)) {
      System.out.println("Los numeros son: "+n2+" - "+n1+" - "+n3);
    } else if ((n2>n3) && (n3>n1)) {
      System.out.println("Los numeros son: "+n2+" - "+n3+" - "+n1);
    } else if ((n3>n1) && (n1>n2)) {
      System.out.println("Los numeros son: "+n3+" - "+n1+" - "+n2);
    } else {
      System.out.println("Los numeros son: "+n3+" - "+n2+" - "+n1);
    }
  }
  
}
