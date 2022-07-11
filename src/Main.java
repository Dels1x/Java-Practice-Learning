import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Arrays.stream(Kata.sortArray(new int[] {9, 51, 8, 8, 5, 1, 2, 4 ,6})).forEach(System.out::println);

    }


}

class Kata {
    public static int[] sortArray(int[] array) {
        int[] oddNumbers = Arrays.stream(Arrays.stream(array).filter(i -> i % 2 == 1).toArray()).sorted().toArray();
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1) {
                array[i] = oddNumbers[count++];
            }
        }

        return array;
    }
}

