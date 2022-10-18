package arrays.src;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Consoantes {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] consonant = new String[6];
    int quantityConsonant = 0;
    int count = 0;
    
    do {
      System.out.print("Digite uma letra: ");
      String letter = scan.next();

      if(!(letter.equalsIgnoreCase("a") ||
            letter.equalsIgnoreCase("e") ||
            letter.equalsIgnoreCase("i") ||
            letter.equalsIgnoreCase("o") ||
            letter.equalsIgnoreCase("u"))
          ) {
            consonant[count] = letter;
            quantityConsonant++;
          }
      
      count++;
    }while(count < consonant.length);

    System.out.println("Você digitou " + quantityConsonant + " consoantes");
  }
}
