package loops;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ParEImpar {
  public static void main(String[] args) {
    int quantityNumber;
    int count = 0;
    int number;
    int quantityOdd = 0;
    int quantityEven = 0;
    Scanner scan = new Scanner(System.in);

    System.out.println("Quantos números inteiros você quer informar?");
    quantityNumber = scan.nextInt();

    do {
      System.out.println("Informe um número: ");
      number = scan.nextInt();
      
      if(number % 2 == 0) quantityEven++;
      else quantityOdd++;

      count++;
    } while(count < quantityNumber);

    System.out.println("Quantidade de números pares: " + quantityEven);
    System.out.println("Quantidade de números impares: " + quantityOdd);
  }
}
