import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int[] arr = {-5, 2, 9, 3, -15, 62, 16, -6, 17, 101, 17, 9, 2, 2, 2, 0, 1, 1, 1, 0};
        List<randomNumber> arr1 = Arrays.asList(
                new randomNumber(), new randomNumber(), new randomNumber(),
                new randomNumber(), new randomNumber(), new randomNumber(),
                new randomNumber(), new randomNumber(), new randomNumber()
        );

        displayArray(arr);

        // filter

        displayArray(Arrays.stream(arr).filter(i ->  i % 2 == 0).toArray());

        // you can also use multiple filters

        displayArray(Arrays.stream(arr).filter(i -> i % 2 == 1).filter(i -> i > 10).toArray());

        // sorted

        displayArray(Arrays.stream(arr).sorted().toArray()); // sorts

        displayArray(arr1.stream().sorted(Comparator.comparing(randomNumber::getNumber)).collect(Collectors.toList()));

        displayArray(arr1.stream().sorted(Comparator.comparing(randomNumber::getNumber).reversed()).collect(Collectors.toList()));

        // distinct

        displayArray(Arrays.stream(arr).distinct().toArray());

        // map

        displayArray(Arrays.stream(arr).map(i -> i * (i * 2)).toArray());

        displayArray(Arrays.stream(arr).filter(i -> i < 0).map(Math::abs).toArray());

        // collect

    }


    private static void displayArray(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println();
    }

    private static void displayArray(List<randomNumber> arr) {
        for(randomNumber i : arr) {
            System.out.println(i.getNumber());
        }
        System.out.println();
    }
}

class randomNumber {
    final private int number;

    randomNumber() {
        Random random = new Random();
        number = random.nextInt();
        System.out.println(number);
    }

    public int getNumber() {
        return number;
    }
}