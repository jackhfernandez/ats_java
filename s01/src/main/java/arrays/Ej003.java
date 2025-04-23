/**
 * Leer 5 numeros por teclado, almacenarlos en un arreglo.
 * Mostrar la media de los positivos
 * Mostrar la media de los negativos
 * Mostrar la cantidad de ceros
 */
package arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej003 {
  
  public static void main(String[] args) {
    
    double contadorCeros=0, cPositivos=0, cNegativos=0, mPositivos=0,
        sPositivos=0, mNegativos=0, sNegativos=0;
    
    Scanner scanner = new Scanner(System.in);
    
    int[] numeros = new int[5];
    
    // Recibir los elementos del arreglo
    for (int i=0; i<5; i++) {
      numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese elemento " + (i+1) + ": "));
    }
    
    // Recorrer el arreglo y calcular la media
    for (int i=0; i<5; i++) {
      if (numeros[i] == 0 ) {
        contadorCeros++;
      } else if (numeros[i] > 0 ) {
        cPositivos++;
        sPositivos += numeros[i];
      } else {
        cNegativos++;
        sNegativos += numeros[i];
      }
    }
    
    // Obteniendo media positivos
    if (cPositivos == 0) {
      mPositivos = 0;
    } else {
      mPositivos = (double) sPositivos / cPositivos;
    }
    
    // Obteniendo media negativos
    if (cNegativos == 0 ) {
      mNegativos = 0;
    } else {
      mNegativos = (double) sNegativos / cNegativos;
    }
    
    // Mostrando resultados
    System.out.println("La cantidad  de ceros es: " + contadorCeros);
    System.out.println("La media de positivos es: " + mPositivos);
    System.out.println("La media de negativos es: " + mNegativos);
  }
}
