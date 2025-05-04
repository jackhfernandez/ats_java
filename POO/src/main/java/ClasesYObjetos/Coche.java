/**
 * Creando objeto Coche
 */

package ClasesYObjetos;

/**
 *
 * @author jackh
 */
public class Coche {
  
  // Atributos
  String color;
  String marca;
  int km;

    public static void main(String[] args) {
      
      Coche coche1 = new Coche();
      
      coche1.color = "Blanco";
      coche1.marca = "Audi";
      coche1.km    = 0;
      
      System.out.println("Color coche1: " + coche1.color);
      System.out.println("Marca coche1:" + coche1.marca);
      System.out.println("Kilometraje :" + coche1.km);
      
      Coche coche2 = new Coche();
      
      coche2.color = "Rojo";
      coche2.marca = "Ferrari";
      coche2.km = 100;
      
      System.out.println("\nColor coche2: " + coche2.color);
      System.out.println("Marca coche2: " + coche2.marca);
      System.out.println("Kilometraje : " + coche2.km);
    }
}
