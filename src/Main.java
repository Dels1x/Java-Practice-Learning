import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
                Interpolation Search =  improvement over binary search best used for "uniformly" distributed data
                                        "guesses" where a value might be based on calculate probe results
                                        If probe is incorrect, search area is narrowed, and a new probe is calculated

                                        average case:  O(log(log(n)))
                                        worst case: O(n) [values increase exponentially]
         */

        int[] array = new int[10000];

        for(int i = 0; i < array.length; i++) array[i] = i*3;

        int index = interpolationSearch(array, 21219);

        System.out.println(index);
        if(index != -1)
            System.out.println("Value: "+array[index]);
        else
            System.out.println("Value not found!");
    }

    private static int interpolationSearch(int[] array, int target) {
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


    private static int linearSearch(int[] array, int target) {
        for(int i = 0; i < array.length; i++)
            if(array[i] == target)
                return i;

        return -1;
    }

}
