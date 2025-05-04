/**
 * Ejemplo operacion
 */
package ClasesYObjetos;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class Operacion {
  
  // Scanner global
  Scanner scanner = new Scanner(System.in);
  // Atributos 
  int num1, num2, suma, resta, multiplicacion, division;
  
  // Metodos
  
  
  // Metodo para pedir al usuario dos numeros
  public void leerNumero(){
    System.out.print("Ingrese un numero: ");
    num1 = scanner.nextInt();
    System.out.print("Ingrese otro numero: ");
    num2 = scanner.nextInt();
  }
  
  // Metodo para sumar
  public void sumar(){
    suma = num1 + num2;
  }
  
  // Metodo para restar
  public void restar(){
    resta = num1 - num2;
  }
  
  // Metodo para multiplicar
  public void multiplicar(){
    multiplicacion = num1 * num2;
  }
  
  // Metodo para dividir
  public void dividir(){
    division = num1 / num2;
  }
  
  // Mostrar resultados
  public void mostrarResultados(){
    System.out.println("La suma es " + suma);
    System.out.println("La resta es " + resta);
    System.out.println("La multiplicacion es " + multiplicacion);
    System.out.println("La division es " + division);
  }
}
