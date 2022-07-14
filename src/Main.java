import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Arrays.stream(Kata.arrayDiff(new int[] {1, 2, 3}, new int[] {1})).forEach(System.out::println);

    }
}

class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> c = new ArrayList<>();
        for(int i: a) {
            if(Arrays.stream(b).noneMatch(x -> x == i)) {
                c.add(i);
            }
        }

        return c.stream().mapToInt(Integer::intValue).toArray();
    }
}