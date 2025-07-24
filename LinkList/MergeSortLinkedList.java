public class MergeSortLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add at end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Function to print the list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Merge Sort
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split into halves
        Node mid = getMiddle(head);
        Node rightHead = mid.next;
        mid.next = null;

        // Step 2: Sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        // Step 3: Merge sorted halves
        return merge(left, right);
    }

    // Find middle node
    public Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    public Node merge(Node left, Node right) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes
        if (left != null) tail.next = left;
        if (right != null) tail.next = right;

        return dummy.next;
    }

    // Main method
    public static void main(String[] args) {
        MergeSortLinkedList list = new MergeSortLinkedList();

        list.add(50);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);

        System.out.println("Original List:");
        list.printList(list.head);

        list.head = list.mergeSort(list.head);

        System.out.println("Sorted List:");
        list.printList(list.head);
    }
}
