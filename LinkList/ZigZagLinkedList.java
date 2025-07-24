class ZigZagLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void zigZag(Node head) {
        boolean flag = true; // true means "<" relation expected

        Node current = head;
        while (current != null && current.next != null) {
            if (flag) {
                if (current.data > current.next.data) {
                    // swap
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            } else {
                if (current.data < current.next.data) {
                    // swap
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }

            // flip flag
            flag = !flag;
            current = current.next;
        }
    }

    // Helper to print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        zigZag(head);

        System.out.println("Zig-Zag List:");
        printList(head);
    }
}
