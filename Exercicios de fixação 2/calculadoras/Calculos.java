package calculadoras;

public class Calculos {
  double total;

  public void aritmetica(double n1, double n2) {
    this.total = (n1 + n2) / 2;
  }

  public void ponderada(double n1, double n2, double n3) {
    this.total = ((n1 * 1) + (n2 * 2) + (n3 * 3)) / 6;
  }
}
