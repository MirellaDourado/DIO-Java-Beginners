
import java.util.*;

public class QuadradosPerfeitos {
    public static void main(String[] args) {
      int n = Integer.parseInt(new Scanner(System.in).nextLine());
      int response, count, total;
      int[] d = new int[n + 1];
    
      for (int i = 1; i < d.length; i++) {
        if (i * i <= n) {
          d[i] = i * i;
        } else {
          i = d.length - 1;
        }
      }
    total = 100;
      
    for (int i = d.length - 1; i > 0 && i <= n; i--) {
      if (i > 0 && d[i] > 0) {
        response = n;
        count = 0;
        for (int index = i; index > 0; index--) {
          while (response > 0) {
            if (response >= d[index]) {
              response = response - d[index];
              count++;
            } else {
              index--;
            }
          }
        }                
        if (total > count) {
          total = count;
        }
      }            
    }
    System.out.println(total);
  }
}