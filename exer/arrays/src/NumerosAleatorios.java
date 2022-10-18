package arrays.src;
import java.util.Arrays;
import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class NumerosAleatorios {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[20];
    
    for(int index = 0; index < numbers.length; index++) {
      int number = random.nextInt(100);
      numbers[index] = number;
    }

    System.out.println(Arrays.toString(numbers));
  }
}