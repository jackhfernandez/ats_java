/**
 * Leer 10 enteros en una tabla. Guardar en otra tabla los
 * elementos pares de la primera, y a continuación los elementos impares.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej014 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int cPares = 0, cImpares = 0;
    int[] arreglo = new int[10];
    
    // Recibiendo elementos
    System.out.println("Ingrese elementos: ");
    for (int i = 0; i < 10; i++) {
      //arreglo[i] = scanner.nextInt();
      arreglo[i] = i+1;

      // Contar la cantidad de numeros pares e impares
      if (arreglo[i] % 2 == 0) {
        cPares++;
      } else {
        cImpares++;
      }
    }

    // Declarar e inicializar 
    int[] impares = new int[cImpares];
    int[] pares = new int[cPares];

    // Inicializar el contador en cero para llenar los arreglos
    cImpares = 0;
    cPares = 0;

    // almacenar en dos arreglos
    for (int i = 0; i < 10; i++) {
      if (arreglo[i] % 2 == 0) {
        pares[cPares] = arreglo[i];
        cPares++;
      } else {
        impares[cImpares] = arreglo[i];
        cImpares++;
      }
    }

    System.out.println("Arreglo con numeros pares");
    for (int par : pares) {
      System.out.print(par + " ");
    }

    System.out.println("\n\nArreglo con numeros impares");
    for (int impar : impares) {
      System.out.print(impar + " ");
    }
  }
}
