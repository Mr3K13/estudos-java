package triângulo;

import java.util.Scanner;

public class Menu {

  public static void main(String[] args) {
    Calculos lados = new Calculos();
    Scanner sides = new Scanner(System.in);

    System.out.println("Digite o primeiro lado:");
    lados.lado1 = (sides.nextFloat());

    System.out.println("Digite o segundo lado:");
    lados.lado2 = (sides.nextFloat());

    System.out.println("Digite o terceiro lado:");
    lados.lado3 = (sides.nextFloat());

    lados.saida();
  }
}