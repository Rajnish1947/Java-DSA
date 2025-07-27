package Queues;
import java.util.Queue;
import java.util.LinkedList;

public class UsingjavaCollection {
     public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // Enqueue (Add elements)
        q.add(10);
        q.add(20);
        q.add(30);

        // Print the front element
        System.out.println("Front element (peek): " + q.peek()); // 10

        // Dequeue (Remove elements)
        System.out.println("Removed: " + q.remove()); // 10
        System.out.println("Removed: " + q.remove()); // 20

        // Current front
        System.out.println("Current Front: " + q.peek()); // 30

        // Check if queue is empty
        if (q.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }
}
