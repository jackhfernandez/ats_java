/**
 * Pedir 10 numeros al usuario: 
 * Mostrar la media de los positivos
 * Mostrar la media de los negativos
 * Mostrar la cantidad de ceros
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej11 {
  
  public static void main(String[] args) {
    
    double mNegativos=0, mPositivos=0, sumaNegativo=0, sumaPositivo=0, n,
        contadorPositivo=0, contadorNegativo=0, contadorCeros=0;
    
    for (int i=0; i<10; i++) {
      n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      
      if (n==0) {
        contadorCeros++;
      } else if (n>0) {
        sumaPositivo+=n;
        contadorPositivo++;
      } else {
        sumaNegativo +=n;
        contadorNegativo++;

      }
    }
    
    // Verificar division en positivos
    if (contadorPositivo == 0) {
      JOptionPane.showMessageDialog(null, "Error division por cero, en los positivos");
    } else {
      mPositivos = sumaPositivo / contadorPositivo;
      JOptionPane.showMessageDialog(null, "Media Positivos: " + mPositivos);      
    }
    
    // Verificar division en negativos
    if (contadorNegativo == 0) {
      JOptionPane.showMessageDialog(null, "Error division por cero en los negativos");
    } else {
      mNegativos = sumaNegativo / contadorNegativo; 
      JOptionPane.showMessageDialog(null, "Media Negativos: " + mNegativos);
    }
    
    // Mostrar cantidad de ceros
    JOptionPane.showMessageDialog(null, "Cantidad de ceros: " + contadorCeros);
  }
}
