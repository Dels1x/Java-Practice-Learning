import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println(PangramChecker.check("The quick brown fox jumps over the lazy dog."));

    }


}

class PangramChecker {
    public static boolean check(String sentence){
        String[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".split("");

        for(int i = 0; i < alphabetArray.length; i++) {
            if(!sentence.toLowerCase().contains(alphabetArray[i])) return false;
        }

        return true;
    }
}


