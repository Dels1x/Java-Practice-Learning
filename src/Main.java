import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(WeightSort.orderWeight("387087 176 351832 100 430372 8 58052 54 175432 120 269974 147 309754 91 404858 67 271476 164 295747 111 40"));


    }
}

class WeightSort {

    public static String orderWeight(String string) {
        List<String> arr = Arrays.asList(string.split(" "));
        arr.sort((o1, o2) -> {
            int diff = WeightSort.sumOfDigits(o1) - WeightSort.sumOfDigits(o2);
            return diff == 0 ? o1.compareTo(o2) : diff < 0 ? -1 : 1;
        });

        return String.join(" ", arr);
    }
    private static int sumOfDigits(String num) {
        int sum = 0;

        for(String i : num.split("")) {
            sum += Integer.parseInt(i);
        }

        return sum;
    }
}