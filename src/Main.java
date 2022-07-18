import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = new int[1000000];

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
            array[i] = i;
        }

        startTime = System.nanoTime();

        //linkedList.add(5, -5);
        //linkedList.get(500000);
        //linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t"+elapsedTime);

        startTime = System.nanoTime();

        //arrayList.add(5, -5);
        //arrayList.get(500000);
        //arrayList.remove(500000);
        arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t"+elapsedTime);

    }
}


