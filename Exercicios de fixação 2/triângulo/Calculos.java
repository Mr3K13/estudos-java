package triângulo;

public class Calculos {
  public float lado1, lado2, lado3, eq1, eq2, eq3;
  public String result;

  public String triangulo() {
    eq1 = lado1 + lado2;
    eq2 = lado1 + lado3;
    eq3 = lado2 + lado3;
    if (eq1 < lado3 || eq2 < lado2 || eq3 < lado1) {
      result = "Isso não é um triângulo";
      return result;
    } else if (lado1 == lado2 && lado2 == lado3) {
      result = "Isso é um triângulo equilátero.";
      return result;
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
      result = "Isso é um triângulo isósceles.";
      return result;
    } else {
      result = "Isso é um triângulo escaleno.";
      return result;
    }
  }

  public void saida() {
    triangulo();
    System.out.println(result);
  }
}