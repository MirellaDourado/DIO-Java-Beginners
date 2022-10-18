package loops.src;
import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class MaiorEMedia {
  public static void main(String[] args) {
    int number;
    Scanner scan = new Scanner(System.in);
    int biggest = 0;
    int summation = 0;

    for(int count = 0; count < 5; count++){
      System.out.println("Escreva um número inteiro");
      number = scan.nextInt();
      summation += number;

      if(biggest < number) biggest = number;
    }

    System.out.println("O maior número é " + biggest + " e média dos números informados é: " + summation / 5);
  }
}
