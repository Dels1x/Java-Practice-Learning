import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
                Merge Sort = o(n log n)
         */

        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

        System.out.println(Arrays.toString(array));


    }

    public static void mergeSort(int[] array) {
        int length = array.length;

        if(length <= 1) return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        for(; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0;

        // check the conditions for merging

        while(l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            }
            else{
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }

        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
           r++;
        }
    }

}
