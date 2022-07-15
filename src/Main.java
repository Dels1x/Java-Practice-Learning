import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println(Kata.encode("Success"));

    }
}

class Kata {
    static String encode(String word){
        int length = word.length();
        String temp;
        String output = "";

        for(int i = 0; i < length; i++) {
            temp = word.substring(i, i+1).toLowerCase();
            String concat = word.substring(0, i).concat(word.substring(i+1)).toLowerCase();

            if(concat.contains(temp)) {
                output = output.concat(")");
            } else {
                output = output.concat("(");
            }
        }

        return output;
    }
}