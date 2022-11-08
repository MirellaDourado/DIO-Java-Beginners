import java.util.*;


public class ClassificandoMatrizes {  
  public static void main(String args[]) {
        
    Scanner input = new Scanner(System.in);
    int i, keep;
    int N = input.nextInt();
    int [] nums = new int[N];
      for (i = 0; i < N; i++)
      {
        nums[i] = input.nextInt();
      }
        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares 
    int j = 0;
    for (i = 0; i < nums.length; i++) {
      if (nums[i] % 2 != 0) {
        for (j = (i + 1); j < N; j++) {
          if (nums[j] % 2 == 0){
            keep = nums[i];
            nums[i] = nums[j];
            nums[j] = keep;
            j = N;
          }
        }
      }
    }

    for(i = 0; i < N; i++){
      System.out.println(nums[i]);
    }
  }
}