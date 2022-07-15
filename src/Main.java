import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println(Kata.pigIt("Pig latin is cool !"));

    }
}

class Kata {
    public static String pigIt(String str) {
        String[] strArr = str.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : strArr) {
            if(word.matches("\\p{Punct}")) {
                output.append(word.substring(1)).append(word.charAt(0));
            } else {
                output.append(word.substring(1)).append(word.charAt(0)).append("ay ");
            }
        }

        return output.toString().trim();
    }
}