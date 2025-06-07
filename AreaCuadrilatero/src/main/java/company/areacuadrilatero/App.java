package company.areacuadrilatero;

import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) {

    // Inicializar objeto con valores temporales
    AreaCuadrilatero c1 = new AreaCuadrilatero(0, 0);
    
    // Llamando funciones
    calcular(c1);
    mostrarResultados(c1);

  }

  // Pedir numero
  static float pedirNumero(String mensaje) {
    float n = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    return n;
  }

  // Calcular
  static void calcular(AreaCuadrilatero c) {
    float lado1 = pedirNumero("Ingrese lado1: ");
    float lado2 = pedirNumero("Ingrese lado2: ");

    if (lado1 == lado2) {
      c.setLados(lado1);
    } else {
      c.setLados(lado1, lado2);
    }
  }

  // Mostrar resultados
  static void mostrarResultados(AreaCuadrilatero c) {
    JOptionPane.showMessageDialog(null, "Area     : " + c.getArea()
        + "\nPerimetro: " + c.getPerimetro());
  }
}
