import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.push("S");
        linkedList.pop(); */

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.offer("S");
        linkedList.poll();

        linkedList.add(4, "E");

        System.out.println(linkedList);

        linkedList.remove("E");

        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("9");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println(linkedList.get(3));
        System.out.println(linkedList.size());

    }
}