/**
 *  Comprobar si una letra (caracter) ingresado por el usuario es mayuscula
 */
package conditionals;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class If {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese un caracter: ");
    char letra = scanner.next().charAt(0);
    
    if (Character.isUpperCase(letra)) {
      System.out.println("El caracter es mayuscula");
    } else {
      System.out.println("No es mayuscula");
    }
  }
  
}
