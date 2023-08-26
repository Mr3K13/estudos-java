package aulas;

public class Aluno {
  public double delta, c, a, b, x1, x2;

  public Aluno() {
  }

  public static <string> void main(string[] args) {
  }

  public void operacao() {
    delta = Math.pow(b, 2) - (4 * a * c);
    this.x1 = (b * -1 + Math.sqrt(delta)) / (2 * a);
    this.x2 = (b * -1 - Math.sqrt(delta)) / (2 * a);
  }

  public void calbhaskara() {
    operacao();
    System.out.println("o valor de x1 é:" + x1);
    System.out.println("o valor de x2 é:" + x2);
  }
}