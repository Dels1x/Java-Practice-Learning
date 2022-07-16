import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /*
                Queue = FIFO data structure. First-In First-Out
                        A collection designed for holding elements prior to processing
                        Linear data structure

                        add = enqueue, offer()
                        remove = dequeue, poll()
        */

        Queue<String> queue = new LinkedList<>();

        queue.offer("Danya Kostyanitca");
        queue.offer("Danya Hamula");
        queue.offer("Danislav Anufriev");
        queue.offer("Kirill Charyshnikov");


        System.out.println(queue);
        System.out.println(queue.peek()); // returns first element
        System.out.println(queue.poll()); // removes first element and returns it
        System.out.println(queue.size()); // returns size of queue
        System.out.println(queue.contains("Danya Hamula")); // checks if queue contains the string

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        // queue.element() - throws exception
        queue.poll(); // - doesn't throw

        System.out.println(queue);
        System.out.println(queue.isEmpty());

        // Where are queues useful?

        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first-search

    }
}
