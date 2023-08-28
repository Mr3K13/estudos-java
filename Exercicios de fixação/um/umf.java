package um;

import java.util.Scanner;

public class umf {
  public static void main(String[] args) {
    um x = new um();
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual o primeiro valor da hipotenusa? ");
    x.a = (sc.nextInt());

    System.out.print("Qual o segundo valor da hipotenusa? ");
    Scanner sx = new Scanner(System.in);
    x.b = (sx.nextInt());
    x.Hypotenusa();
    sx.close();
    sc.close();
  }
}