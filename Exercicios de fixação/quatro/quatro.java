package quatro;

public class quatro {
  public double valor1, valor2, valor3;

  public void resultado() {
    if (valor1 > valor2) {
      if (valor1 > valor3) {
        System.out.print("O primeiro valor (" + valor1 + ") é o maior.");

      } else {
        System.out.print("O terceiro valor (" + valor3 + ") é o maior.");
      }
    } else if (valor2 > valor3) {
      System.out.print("O segundo valor (" + valor2 + ") é o maior.");
    } else {
      System.out.print("O terceiro valor (" + valor3 + ") é o maior.");
    }
  }
}