import java.util.Scanner;

public class Palindromos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String palavra = sc.nextLine();
    System.out.println(itsPalindrome(palavra));
  }
  
  public static String invertedWord(String word) {
    String[] letters = word.split("");
    String reverse = "";
    for (int index = word.length() - 1; index >= 0; index--){
      reverse = reverse + letters[index];
    };
    return reverse;
  }

  public static String itsPalindrome(String word ) {
    String result = invertedWord(word).equals(word) ? "TRUE" : "FALSE";
    return result;
  }
}