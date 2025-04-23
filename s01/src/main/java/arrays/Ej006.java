/**
 * Ejercicio 6: Leer los datos correspondiente a dos tablas de 12 elementos
 * numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A,
 * 3 de la B, otros 3 de A, otro, 3 de la B, etc. -
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej006 {
  
   public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);
     
     int[] a = new int[12]; int[] b = new int[12]; int[] c = new int[24];
     int j=1;
     
     // Pedir los elementos para el primer array 
     //System.out.println("Ingrese elementos para el array 'a': ");
     for (int i=0; i<12; i++) {
       a[i] = (i+1); // Completar el array de forma automatica
       //System.out.print("Ingrese el elemento " + (i+1) + ": ");
       //a[i] = scanner.nextInt();
     }
     
     // Pedir los elementos para el segundo array
     //System.out.println("Ingrese los elementos para el array 'b': ");
     for (int i=0; i<12; i++) {
       b[i] = (i+1); // Completar el array de forma automatica
       //System.out.print("Ingrese elementos " + (i+1) + ": ");
       //b[i] = scanner.nextInt();
     }
     
     // Combinar los elementos en el tercer array
     int indiceA=0, indiceB=0, indiceC=0; // variables de control
     
     while (indiceA<12 && indiceB<12) {
       
       // Anadir tres elementos del array A
       for (int i=0; i<3 && indiceA<12; i++) {
         c[indiceC++] = a[indiceA++];
       }
       
       // Anadir tres elementos del array B
       for (int i=0; i<3 && indiceB<12; i++) {
         c[indiceC++] = b[indiceB++];
       }
     }
     
     // Mostrar el array 'c'
     System.out.println("Mostrando el array 'C'");
     for (int i=0; i<24; i++) {
       System.out.print(c[i] + " ");
     }
  }
}