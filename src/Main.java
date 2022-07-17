import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println(WeightSort.orderWeight("387087 176 351832 100 430372 8 58052 54 175432 120 269974 147 309754 91 404858 67 271476 164 295747 111 40"));


    }
}

class WeightSort {

    public static String orderWeight(String string) {
        int sum;
        String output = "";
        String[] arr = string.split(" ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] values = new int[arr.length];


        for(int i = 0; i < arr.length; i++) {
            sum = 0;

            for(int j = 0; j < arr[i].length(); j++) {
                sum += Character.getNumericValue(arr[i].charAt(j));
            }

            values[i] = sum;
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(values[i] > values[j]) {
                    int intTemp = values[i];
                    String strTemp = arr[i];
                    values[i] = values[j];
                    values[j] = intTemp;
                    arr[i] = arr[j];
                    arr[j] = strTemp;
                }
            }
        }

        for(String i : arr) output = output.concat(i.concat(" "));

        return output.trim();
    }
}