package dois;

import java.util.Scanner;

public class doisf {

  public static void main(String[] args) {
    dois x = new dois();
    Scanner sc = new Scanner(System.in);
    System.out.print("Oque o Sr(a) deseja ?");
    System.out.print("\n1 - Sacar");
    System.out.print("\n2 - Depositar");
    System.out.print("\n3 - Extrato");
    System.out.print("\n0 - Sair");
    System.out.print("\n");
    x.o = (sc.nextInt());

    x.conta();
    sc.close();
  }

}
