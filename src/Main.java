import java.math.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {

        int[] array = noDuplicates(new int[] {5, 3, 7});

        for(int i : array) System.out.println(i);

    }

    public static int[] noDuplicates(int[] arr){
        return Arrays.stream(arr).distinct().toArray();
    }

}