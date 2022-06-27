import java.math.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] invertedArray = invert(new int[] {-2, 4, -62, 61, -51, 61});

        for(int i : invertedArray) System.out.println(i);

    }

    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(i -> -i).toArray();
    }

}
