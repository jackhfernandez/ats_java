/**
 * Ejercicio 4: Una compañía de venta de carros usados, paga a su personal de
 * ventas un salario de $1000 mensuales, mas una comisión de $150 por cada
 * carro vendido, más el 5% del valor de la venta por carro. Cada mes el
 * capturista de la empresa ingresa en la computadora los datos pertinentes.
 * Hacer un programa que calcule e imprima el salario mensual de un vendedor dado
 */
package company;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Ej02 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    // Definir constantes
    final double SALARIO_BASE      = 1000.00;
    final double COMISION_CARRO    =  150.00;
    final double PORCENTAJE_VENTAS =    0.05;
    
    // Entrada de datos
    System.out.println("Programa para calcular el salario de un vendedor\n");
    System.out.print("Ingrese  la  cantidad  de   carros   vendidos: ");
    int carrosVendidos = entrada.nextInt();
    
    System.out.print("Ingrese el monto total de ventas del vendedor: ");
    double valorVentas = entrada.nextDouble();
    
    // Calculo de operaciones
    double comisionPorCarros = carrosVendidos * COMISION_CARRO;
    double porcentajePorVenta = valorVentas * PORCENTAJE_VENTAS;
    double salarioMensual = SALARIO_BASE + comisionPorCarros + porcentajePorVenta;
    
    // Salida de datos
    System.out.printf("El salario del vendedor es $%.2f%n", salarioMensual);
    
    entrada.close();
  }
  
}
