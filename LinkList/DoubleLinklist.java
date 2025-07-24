public class DoubleLinklist {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove first
    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        int val = head.data;
        if (head == tail) { // Only one node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }

    // Remove last
    public int removeLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return -1;
        }

        int val = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }

    // reverse
    // Reverse the doubly linked list
    public void reverse() {
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            // Swap next and prev
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            // Move to next node using original prev
            curr = curr.prev;
        }

        // After loop, temp is at the node before null, i.e., the new head
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Print list
    public void print() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main function to test
// Main function to test
public static void main(String[] args) {
    DoubleLinklist dll = new DoubleLinklist();
    dll.addFirst(10);
    dll.addFirst(20);  // List: 20 -> 10
    dll.addLast(5);    // List: 20 -> 10 -> 5
    dll.print();       // Expected: 20 <-> 10 <-> 5 <-> null

    dll.reverse();     // List becomes: 5 <-> 10 <-> 20
    System.out.println("Reversed List:");
    dll.print();       // Output: 5 <-> 10 <-> 20 <-> null

    dll.removeFirst(); // removes 5
    dll.print();       // Expected: 10 <-> 20 <-> null

    dll.removeLast();  // removes 20
    dll.print();       // Expected: 10 <-> null

    System.out.println("Size: " + size); // Size: 1
}

}
