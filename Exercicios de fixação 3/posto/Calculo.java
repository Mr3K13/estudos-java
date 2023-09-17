package posto;

public class Calculo {
  double total, desconto, valort;

  public void calculo(double litros, double valor, double desconto1, double desconto2) {

    if (litros <= 20) {
      this.valort = valor * litros;
      this.desconto = valort * desconto1;
      this.total = valort - desconto;
    } else {
      this.valort = valor * litros;
      this.desconto = valort * desconto2;
      this.total = valort - desconto;
    }
  }
}
