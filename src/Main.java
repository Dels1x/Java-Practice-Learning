import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
                Recursion - Advantages:
                            easier to read/write
                            easier to debug

                            Disadvantages:
                            sometimes slower
                            uses more memory
         */

        int[] array = {2, 1, 9, 5, 4, 7, 6, 8, 3, 27, 4, -5, -3, 0};
        char[] chars = "agaoigoeagojaoghj".toCharArray();

        System.out.println("aBcd".equalsIgnoreCase("abcd"));
        System.out.println("armaggedon".compareToIgnoreCase("Gratisfaction"));
        System.out.println("!level".startsWith("!"));
        System.out.println("sheeeeeeeeeeeeeeeeeeeeesh".matches("she{0,3}sh"));
        System.out.println("sheeesh".matches("she{0,3}sh"));
        System.out.println(String.copyValueOf(chars));

        int sum = 2;

        while(sum <= 50) {
            sum = sum*sum;
        }

        System.out.println(sum);


    }

    private static int power(int base, int exponent) {
        return exponent < 1 ? 1 : base * power(base, exponent-1);
    }

    private static long factorial(int num) {
        return num < 1 ? 1 : num * factorial(num - 1);
    }

    public static int squareUntil50(int n) {
        return n*n >= 50 ? n*n : squareUntil50(n*n);
    }


    public static void insertionSort(int[] array) {
        int temp;

        for(int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }

    public static void selectionSort(int[] array, boolean ascending) {
        int min;
        int temp;

        for(int i = 0; i < array.length - 1; i++) {
            min = i;

            for(int j = i + 1; j < array.length; j++) {
                if(ascending && array[j] < array[min]) min = j;
                else if (!ascending && array[j] > array[min]) min = j;
            }

            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

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
