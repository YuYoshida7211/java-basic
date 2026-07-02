import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}