package company.areacuadrilatero;

public class AreaCuadrilatero {

  // Propiedades
  private float lado1;
  private float lado2;

  // Metodo constructor 1. Cuando sea cuadrilatero
  public AreaCuadrilatero(float lado1, float lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  // Metodo constructor 2. Cuando sea cuadrado
  public AreaCuadrilatero(float lado1) {
    this.lado1 = this.lado2 = lado1;
  }

  // Set para modificar los lados
  public void setLados(float lado1, float lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  // Set modificar un lado
  public void setLados(float lado) {
    this.lado1 = this.lado2 = lado;
  }

  // obtener perimetro
  public float getPerimetro() {
    float perimetro = 2 * (lado1 + lado2);
    return perimetro;
  }

  // Obtener area
  public float getArea() {
    float area = lado1 * lado2;
    return area;
  }
}
