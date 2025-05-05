/**
 * Sobrecarga de metodos y constructores
 */
package Sobrecarga;

/**
 *
 * @author jackh
 */
public class Main {

  public static void main(String[] args) {

    Persona p1 = new Persona("Jack", 20);

    p1.correr();
    
    Persona p2 = new Persona("909090");
    
    p1.correr(10);
  }
}
