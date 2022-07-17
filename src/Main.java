import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Kata.tribonacci(new double[]{13, 10, 20}, 8)));

    }
}

class Kata {
    public static double[] tribonacci(double[] s, int n) {
        double[] array = Arrays.copyOf(s, n);

        for(int i = 3; i < n; i++) array[i] = array[i-3]+array[i-2]+array[i-1];

        return array;
    }
}