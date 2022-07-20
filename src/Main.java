import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
                Bubble Sort =   pairs of adjacent elements are compared, and the elements swapped,
                                if they are not in order.

                                Quadratic time O(n^2)
                                small data set = okay-ish
                                large data set = bad
         */

        int[] array = {2, 1, 9, 5, 4, 7, 6, 8, 3};

        bubbleSort(array,true);

        System.out.println(Arrays.toString(array));


    }

    public static void bubbleSort(int[] array, boolean ascending) {
        for(int i = 0; i < array.length-1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(ascending && array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                else if(!ascending && array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static int interpolationSearch(int[] array, int target) {
        int probe;
        int low = 0;
        int high = array.length-1;

        while(target >= array[low] && target <= array[high] && low <= high) {
            probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

            System.out.println("Probe: "+probe);

            if(array[probe] == target) return probe;
            else if(array[probe] < target) low = probe + 1;
            else high = probe - 1;
        }

        return -1;
    }

    public static int binarySearch(int[] array, int target) {
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


    public static int linearSearch(int[] array, int target) {
        for(int i = 0; i < array.length; i++)
            if(array[i] == target)
                return i;

        return -1;
    }

}
