
public class add1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add at beginning
    public void AddFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void AddLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add in middle at given index
    public void AddMiddle(int idx, int data) {
        if (idx == 0) {
            AddFirst(data);
            return;
        }
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Remove first element
    public int removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return val;
    }

    // Remove last element
    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        int val;
        if (size == 1) {
            val = head.data;
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            val = tail.data;
            temp.next = null;
            tail = temp;
        }

        size--;
        return val;
    }

    // Remove from middle
    public int removeMiddle(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return Integer.MIN_VALUE;
        }

        if (idx == 0) return removeFirst();
        if (idx == size - 1) return removeLast();

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    // Search element in list, return index or -1
    public int search(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // Print all elements
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Return size of list
    public int getSize() {
        return size;
    }

    // Reverse the linked list iteratively
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        tail = head; // old head becomes tail after reverse

        while (curr != null) {
            next = curr.next;  // save next node
            curr.next = prev;  // reverse pointer
            prev = curr;       // move prev forward
            curr = next;       // move curr forward
        }
        head = prev; // new head
    }

    public static void main(String[] args) {
        add1 ll = new add1();

        ll.AddFirst(10);
        ll.AddLast(20);
        ll.AddLast(30);
        ll.AddMiddle(1, 15);

        System.out.println("Original List:");
        ll.print();  // 10 -> 15 -> 20 -> 30 -> null

        ll.reverse();

        System.out.println("Reversed List:");
        ll.print();  // 30 -> 20 -> 15 -> 10 -> null
    }
}

