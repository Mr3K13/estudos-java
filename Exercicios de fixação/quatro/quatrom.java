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
    x.verificador();
    if (x.valor1 > x.valor2) {
      if (x.valor1 > x.valor3) {
        System.out.print("O primeiro valor(" + x.valor1 + ") é o maior.");

      }
      System.out.print("O terceiro valor(" + x.valor3 + ") é o maior.");
    } else if (x.valor2 > x.valor3) {
      System.out.print("O segundo valor(" + x.valor2 + ") é o maior.");
    } else {
      System.out.print("O terceiro valor(" + x.valor3 + ") é o maior.");
    }
  }
}
