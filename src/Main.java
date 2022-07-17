import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Kata.tribonacci(new double[]{13, 10, 20}, 2)));

    }
}

class Kata {
    public static double[] tribonacci(double[] s, int n) {
        ArrayList<Double> arrayList = new ArrayList<>();

        if (n > 2) {
            for (double i : s) arrayList.add(i);
        } else {
            for (int i = 0; i < n; i++) arrayList.add(s[i]);
            return arrayList.stream().mapToDouble(d ->d).toArray();
        }

        for(int i = 2; i < n-1; i++) arrayList.add(arrayList.get(i - 2) + arrayList.get(i - 1) + arrayList.get(i));

        return arrayList.stream().mapToDouble(d -> d).toArray();
    }
}