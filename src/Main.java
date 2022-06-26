import java.math.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        System.out.println(high("a b c d e f"));
    }

    public static String high(String s) {
        Character currentChar;
        Character alphabetChar;
        String word;

        String[] words = s.split(" ");
        int[] scores = new int[words.length];
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();


        for(int i = 0; i < words.length; i++) {
            word = words[i];
            System.out.println(word);

            for(int j = 0; j < word.length(); j++) {
                currentChar = word.charAt(j);

                System.out.println(currentChar);

                for(int a = 0; a < alphabet.length; a++) {
                    alphabetChar = alphabet[a];

                    if(currentChar.equals(alphabetChar)) {
                        scores[i] += a+1;
                        break;
                    }
                }
            }
        }

        // for(int score : scores) System.out.println(score);
        // for(String word1 : words) System.out.println(word1);

        return words[getIndexOfLargest(scores)];

    }

    public static int getIndexOfLargest(int[] array) {
        int largest = 0;
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > largest) {
                largest = array[i];
                index = i;
            }
        }

        return index;
    }

}