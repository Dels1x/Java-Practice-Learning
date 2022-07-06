import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = Kata.pipeFix(new int[] {-3,2,3,9});

        Arrays.stream(array).forEach(System.out::println);

        int k = 0;
        do {
            System.out.println("e");
            k++;
        } while (k < 5);


    }


}


class Kata {
    public static int[] pipeFix(int[] numbers) {
        int arrayMin = Arrays.stream(numbers).min().getAsInt(),
                arrayMax = Arrays.stream(numbers).max().getAsInt(),
                arraySize = Math.abs(arrayMin - arrayMax)+1;
        System.out.println(arraySize);
        int[] array = new int[arraySize];

        for(int i = arrayMin; i < arrayMax+1; i++) {
            System.out.println(i-arrayMin);
            array[i-arrayMin] = i;
        }

        return array;

    }
}

