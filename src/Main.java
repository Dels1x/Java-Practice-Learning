import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println(Kata.validParentheses(")(())"));

    }
}

class Kata {
    public static boolean validParentheses(String parens) {
        int count = 0;

        for(int i = 0; i < parens.length(); i++) {
            if(parens.charAt(i) == '(') count++;
            else if(parens.charAt(i) == ')') count--;

            if(count < 0) return false;
        }

        return count == 0;
    }
}