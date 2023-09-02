package dois;

import java.util.Scanner;

public class doism {

  public static void main(String[] args) throws InterruptedException {
    Dois x = new Dois(1000);
    double valor = 0;
    menu(x, valor);
  }

  public static void menu(Dois x, double valor) throws InterruptedException {
    System.out.println("\nO que o Sr.(a) deseja ? \n1 - Sacar\n2 - Depositar\n3 - Extrato\n0 - Sair");
    Scanner sc = new Scanner(System.in);
    int resposta = Integer.parseInt(sc.nextLine());

    switch (resposta) {
      case 1:

        System.out.print("\nQual valor o Sr.(a) deseja sacar? ");
        valor = Double.parseDouble(sc.nextLine());
        x.saque(valor);
        System.out.print("\nO valor da sua taxa é R$");
        System.out.print(x.valorTaxa(valor));
        Thread.sleep(1000);
        menu(x, valor);
        break;

      case 2:
        System.out.print("\nQual valor o Sr.(a) depositar? ");
        valor = Double.parseDouble(sc.nextLine());
        x.deposito(valor);
        Thread.sleep(1000);
        menu(x, valor);
        break;

      case 3:
        System.out.println(x.conta());
        Thread.sleep(1000);
        menu(x, valor);
        break;

      case 0:
        System.out.println("\nAté a próxima.");
        sc.close();

        break;
      default:
        System.out.println("\nPor favor colocar um número válido.");
        Thread.sleep(1000);
        menu(x, valor);
        break;
    }
  }

}
