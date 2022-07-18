import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("E");
        linkedList.add("Z");
        linkedList.push("R");
        linkedList.add(1, "S");

        System.out.println(linkedList);

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < 10; i++) queue.offer(i);
        System.out.println(queue);
        for(int i = 0; i < 10; i++) System.out.println(queue.poll());

        Stack<String> stack = new Stack<>();

        for(String i: linkedList) stack.push(i);
        System.out.println(stack.pop());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(1);
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(9);
        priorityQueue.offer(3);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());



    }
}