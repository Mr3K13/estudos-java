package dois;

import java.util.Scanner;

public class doism {
  public static void main(String[] args) throws InterruptedException {

    dois x = new dois();
    Scanner sc = new Scanner(System.in);
    System.out.print("O que o Sr.(a) deseja ?");
    System.out.print("\n1 - Sacar");
    System.out.print("\n2 - Depositar");
    System.out.print("\n3 - Extrato");
    System.out.print("\n0 - Sair");
    System.out.print("\n");
    int resposta = (sc.nextInt());
    switch (resposta) {
      case 1:
        Scanner sx = new Scanner(System.in);
        System.out.println("Qual valor o Sr.(a) deseja sacar? ");
        x.s = (sx.nextDouble());
        x.saque();
        Thread.sleep(20);
        x.reset();
        sx.close();
        main(args);
        break;

      case 2:
        Scanner dx = new Scanner(System.in);
        System.out.println("Qual valor o Sr.(a) depositar? ");
        x.d = (dx.nextDouble());
        x.deposito();
        Thread.sleep(20);
        x.reset();
        dx.close();
        Thread.sleep(1000);
        main(args);
        break;

      case 3:
        x.conta();
        Thread.sleep(1000);
        main(args);
        break;

      case 0:
        System.out.println("Até a próxima.");
        sc.close();

        break;
      default:
        System.out.println("Por favor colocar um número válido.");
        Thread.sleep(1000);
        main(args);
        break;
    }

  }

}
