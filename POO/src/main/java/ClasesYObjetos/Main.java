/**
 * Funcion principal
 */
package ClasesYObjetos;

/**
 *
 * @author jackh
 */
public class Main {
  
  public static void main(String[] args) {
    
    Operacion op = new Operacion();
    
    op.leerNumero();
    op.sumar();
    op.restar();
    op.multiplicar();
    op.dividir();
    op.mostrarResultados();
  }
}
