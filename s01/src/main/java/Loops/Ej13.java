/**
 * Dada las edades y altura de 5 alumnos. Mostrar la edad y estatura media
 * Mostrar cantidad alumnos mayores de 18
 * Mostrar cantidad alumnos que miden mas de 1.75
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej13 {
  
  public static void main(String[] args) {
    double estatura, edadMedia, estaturaMedia, sumaEdad=0, sumaEstatura=0;
    int edad, contadorEdad=0, contadorEstatura=0;
    
    for (int i=1; i<=5; i++) {
      edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Alumno " +i+ "\nIngrese su edad: "));
      estatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Alumno "+i+"\nIngrese estatura: "));
      
      sumaEdad += edad;
      sumaEstatura += estatura; 
      
      if (edad>18) {
        contadorEdad++;
      }
      
      if (estatura>1.75) {
        contadorEstatura++; 
      }
    }
    
    edadMedia     = (double)sumaEdad / 5;
    estaturaMedia = (double)sumaEstatura /5;
    
    JOptionPane.showMessageDialog(null, "La edad media es: " + edadMedia);
    JOptionPane.showMessageDialog(null, "La estatura media es: " + estaturaMedia);
    JOptionPane.showMessageDialog(null, "Cantidad mayores de 18: " + contadorEdad);
    JOptionPane.showMessageDialog(null, "Cantidad mas altos de 1.75: " + contadorEstatura);
  }
}
