package company;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class EntradaSalida {
    
    public static void main(String[] args) {
      
      Scanner entrada = new Scanner(System.in);
      
      // Entrada de entero
      /*System.out.print("Ingrese un numero: ");
      int numero = entrada.nextInt();
      
      System.out.print ("Ingrese un numero: ");
      int numero2 = entrada.nextInt();
      
      System.out.print("La suma es: " + (numero + numero2));
      */
      
      // Entrada de tipo flotante
      /*
      System.out.print("Ingrese un flotante: ");
      float num1 = entrada.nextFloat();
      
      System.out.print("Mostrando float: "+ num1);
      */
      
      // Entrada de tipo cadena
      /*
      System.out.println("Ingrese su nombre: ");
      String nombre = entrada.next();
      System.out.print("Mostrando nombre: "+ nombre);
      */
      
      // Entrada de tipo cadena larga | frase
      System.out.print("Ingrese una frase: ");
      String frase = entrada.nextLine();
      System.out.println("La frase es: - " + frase);
    }
    
}
