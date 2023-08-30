package dois;

public class dois {
  public double total = 1000, s, tx, d;

  public void saque() {
    tx = (s + 0.5) / 100;
    total = total - s - tx;
  }

  public void deposito() {
    total = total + d;

  }

  public void reset() {
    s = 0;
    tx = 0;
    d = 0;

  }

  public void conta() {
    System.out.println("O seu saldo total é de: " + total);
  }
}
