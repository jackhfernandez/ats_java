package company;

import javax.swing.JOptionPane;


/**
 *
 * @author jackh
 */
public class EntradaJOptionPane {
  
  public static void main(String[] args) {
  
    String cadena;
    int entero;
    char caracter;
    double doble;
    
    cadena   = JOptionPane.showInputDialog("Ingrese una cadena: ");
    entero   = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
    caracter = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);
    doble  = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un double: "));
    
    JOptionPane.showMessageDialog(null, "Mostrando cadena: "+ cadena);
    JOptionPane.showMessageDialog(null, "Mostrando entero: "+ entero);
    JOptionPane.showMessageDialog(null, "Mostrando caracter: "+ caracter);
    JOptionPane.showMessageDialog(null, "Mostrando doble: "+ doble);
    
  }
  
}
