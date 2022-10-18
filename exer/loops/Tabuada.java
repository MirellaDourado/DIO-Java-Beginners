package loops;
import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number;
    int count = 0;
    System.out.println("Informe um número para calcular a tabuada: ");
    number = scan.nextInt();

    while(count < 11) {
      System.out.println(number + " X " + count + " = " + number * count);
      count++;
    }
  }
}
