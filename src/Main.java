import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        System.out.println(DRoot.digital_root(780));

    }
}

class DRoot {
    public static int digital_root(int n) {
        int sum = 0;

        while (String.valueOf(n).length() != 1) {
            sum = 0;

            for (int i = 0; i < String.valueOf(n).length(); i++) {
                sum += Character.getNumericValue(String.valueOf(n).charAt(i));
            }

            n = sum;
        }

        return sum;
    }
}