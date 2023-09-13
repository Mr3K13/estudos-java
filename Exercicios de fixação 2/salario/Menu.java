package salario;

import javax.swing.JOptionPane;

public class Menu {

  public static void main(String[] args) {
    Calculos x = new Calculos();
    JOptionPane.showMessageDialog(null,
        "*******   Parabéns   *******\nA CSM parabeniza a todos\npelo otimo trabalho este ano,\npara demonstrar nossa gratidão vamos dar um aumento salarial,\npor favor coloque o seu antigo salário na próxima aba para saber os novos valores.");
    x.salario = Double
        .parseDouble(JOptionPane.showInputDialog(null, "\n *******   Menu   *******\n\nDigite o seu salário: "));
    x.calculo();
    JOptionPane.showMessageDialog(null,
        "\n *******   Menu   *******\nSalário antes do aumento: R$ " + x.salario + "\nPercentual de aumento: "
            + (x.reajuste * 100) + ("%") + "\nO salário aumentou em: R$ " + (x.salario * x.reajuste)
            + "\nSalário após o aumento: R$ " + (x.salfinal));
  }

}
