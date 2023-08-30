package treis;

public class treis {
  public double nota1, nota2, media, mediam;

  public void operacao() {
    media = (nota1 + nota2) / 2;

  }

  public void operacao2() {
    mediam = (media - 7) * -1;
  }

  public void resposta() {
    operacao();
    if (media == 10) {
      System.out.print("Aprovado com Distinção,sua media foi: " + media);
    } else if (media >= 7) {
      System.out.print("Aprovado,sua media foi: " + media);
    } else {
      operacao2();
      System.out.print("Reprovado,sua media foi: " + media);
      System.out.println("\nVocê precisava de: +" + mediam + " para passar.");
    }
  }
}
