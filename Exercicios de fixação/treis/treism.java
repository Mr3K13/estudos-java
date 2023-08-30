package treis;

import java.util.Scanner;

public class treism {
  public static void main(String[] args) {
    treis x = new treis();
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual a primeira nota? ");
    x.nota1 = (sc.nextDouble());
    sc.nextLine();
    System.out.print("Qual a segunda nota? ");
    x.nota2 = (sc.nextDouble());
    sc.close();
    x.resposta();
  }
}
