import java.util.Scanner;

public class BuscaSequencial {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
    System.out.println("Escreva um número:");
    int number = leitor.nextInt();

    if(buscarNumero(number, elementos) == -1) System.out.println("Numero " + number + " nao encontrado!");
    else System.out.println("Achei o numero " + number + " na posicao " +  buscarNumero(number, elementos));
    buscarNumero(number, elementos);
  }

  static int buscarNumero (int number, int[] elementos) {
    int count = 0;
    while(count < elementos.length && elementos[count] != number){
      count++;
    }
    if(count >= elementos.length || elementos.length == 0) count = -1;
    return count;
  }
}
