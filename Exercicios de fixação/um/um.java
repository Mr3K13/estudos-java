package um;

import java.text.DecimalFormat;

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
    DecimalFormat formatador = new DecimalFormat("0.00");
    System.out.println("o valor da Hypotenusa és : " + formatador.format(hr));
  }

}
