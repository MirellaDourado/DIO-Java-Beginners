import java.util.Scanner;

public class SomarMultiplos {
    public static void main(String[] args) {
        int number, limit;
        int result = 0;
  
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um número:");
        number = input.nextInt();
        System.out.println("Escreva um número limite:");
        limit = input.nextInt();
    
      for(int count = 1; count < limit + 1; count++){
        if(count % number == 0) result += count;
      };
      
      System.out.println(result);
    }
}
