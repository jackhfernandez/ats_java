package company.poo02;

public class Poo02 {

  private static String frase = "Primera frase";

  public static int sumar(int n1, int n2){
    int suma = n1+n2;
    return suma;
  }
  public static void main(String[] args) {
    System.out.println(Poo02.frase);
    System.out.println("Suma " + Poo02.sumar(3,9));
  }
}
