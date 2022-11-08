import java.util.*;

public class FatorialDesajeitado {
  public static void main(String[] args) {
    int n = Integer.parseInt(new Scanner(System.in).nextLine());
    int result = 0;
    int number = n;
    n--;
    while (n > 0) {
      //TODO: Calcule o valor do fatorial de "n", atrinbuindo o retorno a "r".
      number *= n;
      n--;
      if(n != 0){
        number /= n;
        n--;
      }
      number += n;
      n--;
      result += number;
      number = -n;
      if (n == 1 ){
        result += number;
      }   
      n--;
    }
    System.out.println(result);
  }
}