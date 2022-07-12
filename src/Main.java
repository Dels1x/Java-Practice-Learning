import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        CountingDuplicates e = new CountingDuplicates();

        System.out.println(CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzReturnsTwentySix"));

    }


}

class CountingDuplicates {
    public static int duplicateCount(String text) {
        int count = 0;
        String temp;
        text = text.toLowerCase();

        while(text != "") {
            temp = text.substring(0, 1);
            text = text.substring(1);
            if (text.contains(temp)) {
                count++;
                text = text.replace(temp, "");
            }
        }

        return count;
    }
}