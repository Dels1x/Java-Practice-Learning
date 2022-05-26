package projects;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PersonalArrayList {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        String word = "";

        while(!word.toLowerCase(Locale.ROOT).equals("exit")) {
            System.out.println("Enter a text you want to be in the ArrayList: ");
            word = scanner.nextLine();
            words.add(word);
        }

        words.remove(words.size()-1);
        System.out.println();
        System.out.println();
        System.out.println("This is your ArrayList:");
        System.out.println();
        System.out.println(words);
    }
}
