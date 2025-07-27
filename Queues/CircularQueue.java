package Queues;

public class CircularQueue {

    static class Queue {
        int[] arr;
        int size;
        int front = -1;
        int rear = -1;

        Queue(int n) {
            size = n;
            arr = new int[size];
        }

        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // First element
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % size;
            }
            arr[rear] = data;
        }

        // Remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // Only one element
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    // Main method to test the Circular Queue
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50); // Queue is full after this

        System.out.println("Peek: " + q.peek());

        System.out.println("Removing: " + q.remove());
        System.out.println("Removing: " + q.remove());

        q.add(60);
        q.add(70); // Should wrap around

        // Printing the entire queue
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}

