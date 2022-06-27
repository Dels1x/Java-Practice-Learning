import java.math.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};


        System.out.println(Arrays.stream(numbers).min().getAsInt());
        System.out.println(Arrays.stream(numbers).max().getAsInt());

    }

}