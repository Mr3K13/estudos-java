package calculadoras;

import javax.swing.JOptionPane;

public class Menu {
  public static void main(String[] args) {
    Calculos x = new Calculos();
    double n1 = 0, n2 = 0, n3 = 0;
    menu(x, n1, n2, n3);

  }

  public static void menu(Calculos x, double n1, double n2, double n3) {
    int resposta = Integer.parseInt(JOptionPane.showInputDialog(null,
        "\n*********   Menu   *********\n1. Média aritmética\n2. Média ponderada  \n3. Sair \n\nO Que o Sr(a) desejar?"));

    switch (resposta) {
      case 1:
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o primeiro valor? "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o segundo valor? "));
        ((Calculos) x).aritmetica(n1, n2);
        JOptionPane.showMessageDialog(null, "Sua Média aritmética foi: " + x.total);
        menu(x, n1, n2, n3);
        break;

      case 2:
        JOptionPane.showMessageDialog(null,
            "                 ***********   Atenção   ***********\n\nOs pesos foram previamente configurados para: 1,2,3\n\nPara qualquer alteração, falar com o dono do codigo.");
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o primeiro valor? "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o segundo valor? "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o terceiro valor? "));
        ((Calculos) x).ponderada(n1, n2, n3);
        JOptionPane.showMessageDialog(null, "Sua Média ponderada foi: " + x.total);
        menu(x, n1, n2, n3);
        break;

      case 3:
        JOptionPane.showMessageDialog(null,
            "               ******************   Adeus   ******************\n\nObrigado por usar a calculadora de Mr3K13 até a proxima.");
        break;

      default:
        JOptionPane.showMessageDialog(null,
            "  ***********   Atenção   ***********\n\nPor favor colocar um numero valido.");
        menu(x, n1, n2, n3);
        break;
    }
  }
}
