package dois;

public class dois {
  public double total = 1000, s, tx, o;

  public void operation() {
    tx = (s * 0.5) / 100;
    total = total - s - tx;

  }

  public void reset() {
    s = 0;
    tx = 0;
  }

  public void conta() {
    operation();
    System.out.println("O seu saldo Total é de: " + total);
  }
}
