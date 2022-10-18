package arrays.src;

import java.util.Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
  public static void main(String[] args) {
    int[] vetor = {7, -22, 8, 10, 4, -2};
  
    System.out.println("O vetor é:");
    System.out.println(Arrays.toString(vetor));
    System.out.println("Sua forma inversa é: ");
    System.out.print("[");
    for(int count = 5; count > -1; count--) {
      if( count == 0 ) System.out.print(vetor[count] + "");
      else System.out.print(vetor[count] + ", ");
    }
    System.out.println("]");
  }
}
