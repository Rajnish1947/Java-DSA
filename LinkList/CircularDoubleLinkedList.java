public class CircularDoubleLinkedList {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    // Add to front
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        newNode.next = head;
        newNode.prev = tail;
        head.prev = newNode;
        tail.next = newNode;
        head = newNode;
    }

    // Add to end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        newNode.prev = tail;
        newNode.next = head;
        tail.next = newNode;
        head.prev = newNode;
        tail = newNode;
    }

    // Remove first node
    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        int val = head.data;

        if (head == tail) { // one node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        size--;
        return val;
    }

    // Remove last node
    public int removeLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return -1;
        }

        int val = tail.data;

        if (head == tail) { // one node
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        size--;
        return val;
    }

    // Print list
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("List: ");
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    // Main method
    public static void main(String[] args) {
        CircularDoubleLinkedList list = new CircularDoubleLinkedList();
        list.addLast(10);
        list.addFirst(20);
        list.addLast(5);

        list.print(); // 20 <-> 10 <-> 5 <-> (head)

        list.removeFirst(); // removes 20
        list.print();       // 10 <-> 5 <-> (head)

        list.removeLast();  // removes 5
        list.print();       // 10 <-> (head)

        System.out.println("Size: " + size); // 1
    }
}
