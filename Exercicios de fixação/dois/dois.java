package dois;

public class Dois {
  double total;

  public Dois(double totalInicial) {
    this.total = totalInicial;
  }

  public void saque(double saque) {
    double taxa = (saque * 0.05);
    this.total -= (saque + taxa);
  }

  public void deposito(double valor) {
    this.total += valor;
  }

  public String conta() {
    return ("\nO seu saldo total é de: " + this.total + "\n");
  }

  public double valorTaxa(double valor) {
    return (valor * 0.05);
  }
}
