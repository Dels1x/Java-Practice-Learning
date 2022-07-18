import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,3,2,1};

        System.out.println(Kata.findEvenIndex(array));
    }
}


class Kata {
    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(Arrays.stream(Arrays.copyOfRange(arr, 0, i)).sum() ==
               Arrays.stream(Arrays.copyOfRange(arr, i+1, arr.length)).sum()) return i;
        }

        return -1;
    }
}
