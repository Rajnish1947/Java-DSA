
package Queues;
import java.util.Stack;

public class QueueUsingTwoStacks {

    static class MyQueue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Check if the queue is empty
        public boolean isEmpty() {
            return stack1.isEmpty();
        }

        // Add an element to the queue
        public void add(int data) {
            // Move all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            // Push the new element onto stack1
            stack1.push(data);

            // Push everything back to stack1 from stack2
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        // Remove front element from queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return stack1.pop();
        }

        // Peek front element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return stack1.peek();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Front: " + q.peek());     // Output: 10
        System.out.println("Removed: " + q.remove()); // Output: 10
        System.out.println("Is Empty? " + q.isEmpty()); // Output: false
        System.out.println("Removed: " + q.remove()); // Output: 20
        System.out.println("Removed: " + q.remove()); // Output: 30
        System.out.println("Is Empty? " + q.isEmpty()); // Output: true
        System.out.println("Removed: " + q.remove()); // Output: Queue is empty
    }
}
