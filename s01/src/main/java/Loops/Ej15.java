/**
 * Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita
 * un programa para gestionar las facturas. En cada factura figura: el código
 * del artículo, la cantidad vendida en litros y el precio por litro. Se pide
 * de 5 facturas introducidas: Facturación total, cantidad en litros vendidos
 * del artículo 1 y cuantas facturas se emitieron de más de $600.
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author jackh
 */
public class Ej15 {
  
  public static void main(String[] args) {
    int codigo, cantidadLitros, litrosArticulo1=0, contadorMas600=0;
    float precioLitro, importeFactura, facturacionTotal=0;
    
    for (int i=1; i<=5; i++) {
      codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° "+ i +"\nIngrese el codigo: "));
      cantidadLitros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° "+ i +"\nIngrese cantidad litros vendida: "));
      precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N° "+ i +"\nIngrese el precio por litro: "));
      
      importeFactura = (float) cantidadLitros * precioLitro;
      facturacionTotal += importeFactura;
      
      if ( codigo == 1) {
        litrosArticulo1 += cantidadLitros;
      }
      
      if ( importeFactura > 600 ) {
        contadorMas600++;
      } 
    }
    
    System.out.println("Resumen de ventas");
    System.out.println("Facturacion total: " + facturacionTotal);
    System.out.println("Cantidad vendida en litros : " + litrosArticulo1);
    System.out.println("Facturas mas de 600: " + contadorMas600);
  }
}
