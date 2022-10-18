import java.util.Scanner;

/**
 * ChamadaRecursiva
 */
public class ChamadaRecursiva {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int number;

    System.out.println("Digite um valor para chamada recursiva:");
    number = leitor.nextInt();
    System.out.println(somatorio(number));
  }

  static int somatorio(int numero) {
    if (numero == 0) {
        return 0;
    } else {
        return numero + somatorio(numero - 1);
    }
}
}