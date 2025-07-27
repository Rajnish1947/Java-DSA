package Queues;

public class LinkedListQueue {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front = null;
        Node rear = null;

        // isEmpty
        public boolean isEmpty() {
            return front == null && rear == null;
        }

        // enqueue
        public void add(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int frontData = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return frontData;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return front.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Front: " + q.peek()); // 10

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}

