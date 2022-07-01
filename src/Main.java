import java.math.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {

        System.out.println(findUniq(new double[] {3, 4, 3, 9, 4, 4}));

    }

    public static double findUniq(double[] arr){
        int count;
        double[] noDuplicates = Arrays.stream(arr).distinct().toArray();
        for(double i : noDuplicates) {
            count = 0;

            for(double j : arr)
                if(i == j) count++;

            if(count == 1)
                return i;
        }
        return 0;
    }
}