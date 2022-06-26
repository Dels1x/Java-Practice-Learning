import java.math.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        System.out.println(Kata.nextBiggerNumber(6289));

    }

    public class Kata
    {
        public static long nextBiggerNumber(long n)
        {
            String number = "";
            int[] digits = Long.toString(n).chars().map(c -> c-'0').toArray();
            System.out.println(digits);
            digits = Arrays.stream(digits).sorted().toArray();
            for(int i = digits.length-1; i >= 0; i--) {
                number += digits[i];
                System.out.println(i);
            }

            return Integer.valueOf(number);
        }
    }

}