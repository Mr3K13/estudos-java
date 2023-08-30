package quatro;

import java.util.Scanner;

public class quatrom {
  public static void main(String[] args) {
    quatro x = new quatro();
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual o primeiro valor? ");
    x.valor1 = (sc.nextInt());
    sc.nextLine();
    System.out.print("Qual o segundo valor? ");
    x.valor2 = (sc.nextInt());
    sc.nextLine();
    System.out.print("Qual o terceiro valor? ");
    x.valor3 = (sc.nextInt());
    sc.close();
    x.resultado();
  }
}