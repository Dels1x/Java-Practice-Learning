import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /*
                Queue = FIFO data structure. First-In First-Out
                        A collection designed for holding elements prior to processing
                        Linear data structure

                        add = enqueue, offer()
                        remove = dequeue, poll()


                Priority Queue =    FIFO data structure that serves elements
                                    with the highest priorities first
                                    before elements with lower priority
        */

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.5);
        queue.offer(2.5);
        queue.offer(3.2);
        queue.offer(5.5);
        queue.offer(2.1);
        queue.offer(1.9);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        Queue<String> queue1 = new PriorityQueue<>();

        queue1.offer("AMD RX 6600 XT");
        queue1.offer("AMD RX 6500 XT");
        queue1.offer("NVIDIA GeForce RTX 3090");

        while(!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }

        // PriorityQueue<String> sorts string in alphabetical order, you also can use Collections.reverseOrder()


    }
}
