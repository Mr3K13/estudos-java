package posto;

import javax.swing.JOptionPane;

public class Menu {
  public static void main(String[] args) {
    Calculo x = new Calculo();
    double litros = 0, valor = 0, desconto1 = 0, desconto2 = 0;
    menu(x, litros, valor, desconto1, desconto2);

  }

  public static void menu(Calculo x, double litros, double valor, double desconto1, double desconto2) {
    String resposta = JOptionPane.showInputDialog(null,
        "  ***** Bem Vindo(a) *****\n\nEste é o posto do Markin\n\nPara Álcool porfavor digite ------ [A]\n\nPara Gasolina porfavor digite --- [G]");

    switch (resposta.toLowerCase()) {

      case "a":
        valor = 4;
        desconto1 = 0.03;
        desconto2 = 0.05;
        JOptionPane.showMessageDialog(null,
            "**** Aviso *****\n\nEstamos com promoção.\nAté 20 litros, DESCONTO de 3% por litro.\nAcima de 20 litros, DESCONTO de 5% por litro.\n\n    Aproveite",
            "Aviso", JOptionPane.WARNING_MESSAGE);
        litros = Double.parseDouble(
            JOptionPane.showInputDialog(null,
                " ***** Menu *****\n\nO valor do Álcool está: " + valor
                    + "\n\nQuantos litros de Álcool o Sr.(a) deseja colocar?"));
        x.calculo(litros, valor, desconto1, desconto2);
        JOptionPane.showMessageDialog(null, " ***** Aviso *****\n\nO Sr.(a) colocou\nLitros de Álcool: " + litros
            + "\nValor: " + x.valort + "\nDesconto: " + x.desconto + "\nTotal: " + x.total
            + "\n\n ****  Obrigado volte sempre   ****");
        break;
      case "g":
        valor = 5;
        desconto1 = 0.04;
        desconto2 = 0.06;
        JOptionPane.showMessageDialog(null,
            "**** Aviso *****\n\nEstamos com promoção.\nAté 20 litros, DESCONTO de 4% por litro\nAcima de 20, DESCONTO de 6% por litro.\n\n    Aproveite",
            "Aviso", JOptionPane.WARNING_MESSAGE);
        litros = Double.parseDouble(
            JOptionPane.showInputDialog(null,
                " ***** Menu *****\n\nO valor da Gasolina está: " + valor
                    + "\n\nQuantos litros de Gasolina o Sr.(a) deseja colocar?"));
        x.calculo(litros, valor, desconto1, desconto2);
        JOptionPane.showMessageDialog(null, " ***** Aviso *****\n\nO Sr.(a) colocou\nLitros de Gasolina: " + litros
            + "\nValor: " + x.valort + "\nDesconto: " + x.desconto + "\nTotal: " + x.total
            + "\n\n ****  Obrigado volte sempre  ****");
        break;
      default:
        JOptionPane.showMessageDialog(null,
            "  ***********   Atenção   ***********\n\nPor favor colocar uma opição valida.", "alerta",
            JOptionPane.ERROR_MESSAGE);
        menu(x, litros, valor, desconto1, desconto2);
        break;
    }
  }

}
