public class LinkedListPalindrome {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Add a node at the end
    public void add(int data) {
        Node newNode = new Node(data);
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

    // Check if list is palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalfStart = reverseList(slow.next);

        // Step 3: Compare first and second half
        Node firstHalf = head;
        Node secondHalf = secondHalfStart;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Reverse a list and return new head
    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedListPalindrome list = new LinkedListPalindrome();

        // Example 1: Palindrome
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        list.printList();
        System.out.println("Is Palindrome? " + list.isPalindrome());

        // Example 2: Not Palindrome
        LinkedListPalindrome list2 = new LinkedListPalindrome();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        list2.printList();
        System.out.println("Is Palindrome? " + list2.isPalindrome());
    }
}

