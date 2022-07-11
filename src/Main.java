public class Main {
    public static void main(String[] args) {

        System.out.println(PangramChecker.check("The quick brown fox jumps over the lazy dog."));

    }


}

class PangramChecker {
    public static boolean check(String sentence){
        String[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".split("");

        for(String s : alphabetArray) {
            if(!sentence.toLowerCase().contains(s)) return false;
        }

        return true;
    }
}


