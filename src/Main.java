public class Main {
    public static void main(String[] args) {

        /*
                Linear Search = Iterate through a collection one element at a time

                                runtime complexity: O(n)

                                Disadvantages:
                                Slow for large data sets

                                Advantages:
                                Fast for searches of small to medium data sets
                                Does not need to sorted
                                Useful for data structures that do not have random access (Linked Lists)
         */

        int[] array = {5, 2, 6, 8, 1, 9, 13, 15, 14, 58, 0, -3, 87, 7};

        int index = linearSearch(array, 1532);

        System.out.println(index);
        if(index != -1)
            System.out.println("Value: "+array[index]);
        else
            System.out.println("Value not found!");
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++)
            if(array[i] == value)
                return i;

        return -1;
    }

}
