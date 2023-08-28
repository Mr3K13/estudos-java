package um;

public class um {
  public double a, b, h, hr;

  public um() {
  }

  public void operation() {
    h = (a * a) + (b * b);
    hr = Math.sqrt(h);
  }

  public void Hypotenusa() {
    operation();
    System.out.println("o valor da Hypotenusa é: " + hr);
  }

}
