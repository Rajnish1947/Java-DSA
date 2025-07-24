public class DetectCycle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Add node at the end
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

    // Create a cycle for testing (connect last node to node at given position)
    public void createCycle(int pos) {
        if (head == null) return;

        Node temp = head;
        Node cycleNode = null;
        int count = 0;

        while (temp.next != null) {
            if (count == pos) {
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }

        if (cycleNode != null) {
            temp.next = cycleNode;
        }
    }

    // Detect if cycle exists
    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Remove cycle from linked list
    public void removeCycle() {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect meeting point
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (!isCycle) return; // No cycle

        // Step 2: Move one pointer to head and keep other at meeting point
        slow = head;
        Node prev = null; // To track node before fast

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Break the cycle
        prev.next = null;
    }

    // Main method
    public static void main(String[] args) {
        DetectCycle list = new DetectCycle();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.createCycle(2); // create a cycle

        if (list.hasCycle()) {
            System.out.println("Cycle detected in linked list.");
            list.removeCycle();
        } else {
            System.out.println("No cycle in linked list.");
        }

        // Verify again after removal
        if (list.hasCycle()) {
            System.out.println("Cycle still exists.");
        } else {
            System.out.println("Cycle removed successfully.");
        }
    }
}
