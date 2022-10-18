import java.util.Scanner;

public class CheckSameNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int firstNumber;
    int secondNumber;

    System.out.println("Digite o primeiro número: ");
    firstNumber = scan.nextInt();
  System.out.println("Digite o segundo número: ");
    secondNumber = scan.nextInt();

    if(firstNumber == secondNumber) System.out.println("Sao iguais!");
    else System.out.println("Nao sao iguais!");
  }
}
