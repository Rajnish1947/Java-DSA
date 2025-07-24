class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head;
    int size = 0;

    // Add element at end
    public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Find N-th node (0-based)
    public Node findNth(int index) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) return temp;
            count++;
            temp = temp.next;
        }
        return null;
    }

    // Delete N-th node (0-based)
    public void deleteNth(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            if (prev == null || prev.next == null) return;
            prev = prev.next;
        }

        if (prev.next != null) {
            prev.next = prev.next.next;
            size--;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List:");
        list.printList();

        // Find 2nd element
        Node found = list.findNth(2);
        if (found != null)
            System.out.println("Found at index 2: " + found.data);
        else
            System.out.println("Element not found");

        // Delete 2nd element
        list.deleteNth(2);
        System.out.println("After deleting index 2:");
        list.printList();
    }
}
