package pagamentos;

import javax.swing.JOptionPane;

public class Menu {
  public static void main(String[] args) {
    Calculos x = new Calculos();
    x.valorhora = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da sua hora trabalhada?"));
    x.qtdhora = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantas horas você trabalhou neste mês?"));
    x.calculo();
    JOptionPane.showMessageDialog(null,
        "Salário bruto: R$ " + (x.bruto) + "\n(-) IR (" + (x.IR * 100) + "%): R$ " + (x.bruto * x.IR)
            + "\n(-) INSS (10%): R$ " + (x.INSS) + "\nFGTS (11%): R$ " + (x.FGTS) + "\nTotal de descontos: R$ "
            + x.desconto
            + "\nSalário líquido: R$ " + x.liquido);
  }
}
