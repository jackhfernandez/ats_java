package company.poo01;

public class Persona {
  private final String nombre;
  private int edad;

  // Constructor
  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  
  public void mostrarDatos(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad  : " + edad);
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
  
  
}
