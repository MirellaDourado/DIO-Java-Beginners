import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
        switch (s) {
            case "()":
            return true;
            case "[]":
            return true;
            case "{}":
            return true;
            case "":
            return true;
            default:
           return false;
        }
    }

}