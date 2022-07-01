import java.math.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {

        System.out.println(findUniq(new double[] {2, 2, 2, 1, 1, 2, 4, 0, 4, 2}));

    }

    public static double findUniq(double[] arr){
        for(double i : arr) {
            double[] oneNumberArr = Arrays.stream(arr).filter(value -> value == i).toArray();
            if(oneNumberArr.length == 1)
                return oneNumberArr[0];
        }
        return 0;
    }
}