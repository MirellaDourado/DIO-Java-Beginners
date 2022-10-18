package loops.src;
import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Fatorial {
  public static void main(String[] args) {
    int number;
    int storedNumber;
    Scanner scan = new Scanner(System.in);
    int result = 1;
    String calc = "";

    System.out.println("Informe o número a ser fatorado: ");
    number = scan.nextInt();
    storedNumber = number;
    do {
      calc += number;
      result*= number;

      number = number - 1;
      calc += " X ";
    } while( number > 1);

    System.out.println(storedNumber + "! = " + result + "(" + calc + "1)");
  }
}
