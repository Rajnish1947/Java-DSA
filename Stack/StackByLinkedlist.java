

public class StackByLinkedlist {

    // Node class
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of stack (top)
    static Node head = null;

    // isEmpty
    public static boolean isEmpty() {
        return head == null;
    }

    // push
    public static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
   // peek
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
    // pop
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

 

    // Test
    public static void main(String[] args) {
        StackByLinkedlist.push(10);
        StackByLinkedlist.push(20);
        StackByLinkedlist.push(30);

        System.out.println("Top element is: " + StackByLinkedlist.peek()); // 30
        System.out.println("Popped: " + StackByLinkedlist.pop()); // 30
        System.out.println("Popped: " + StackByLinkedlist.pop()); // 20
        System.out.println("Popped: " + StackByLinkedlist.pop()); // 10
        System.out.println("Popped: " + StackByLinkedlist.pop()); // Stack is empty
    }
}
