import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
                Binary Search = Search algorithm that finds the position of target value within a sorted array.
                                Half of the array is eliminated during each step.
                                O(log n).
         */

        int[] array = new int[100000000];

        for(int i = 0; i < array.length; i++) array[i] = i*3;

        int index = binarySearch(array, 270000000);

        System.out.println(index);
        if(index != -1)
            System.out.println("Value: "+array[index]);
        else
            System.out.println("Value not found!");
    }

    private static int linearSearch(int[] array, int target) {
        for(int i = 0; i < array.length; i++)
            if(array[i] == target)
                return i;

        return -1;
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int middle;
        int high = array.length-1;
        int value;

        while(low <= high) {
            middle = low + (high - low) / 2;
            value = array[middle];

            if(value < target) low = middle+1;
            else if (value > target) high = middle-1;
            else return middle;
        }

        return -1;
    }

}
