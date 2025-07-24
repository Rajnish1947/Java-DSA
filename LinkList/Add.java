
public class Add {

    // Node class
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

    // Main method to test
    public static void main(String[] args) {
        Add ll = new Add();

        ll.AddFirst(10);
        ll.AddLast(20);
        ll.AddLast(30);
        ll.AddMiddle(1, 15);  // Insert at index 1

        ll.print();  // 10 -> 15 -> 20 -> 30 -> null

        System.out.println("Removed first: " + ll.removeFirst()); // 10
        System.out.println("Removed last: " + ll.removeLast());   // 30
        System.out.println("Removed mid (index 0): " + ll.removeMiddle(0)); // 15

        ll.print();  // 20 -> null

        System.out.println("Index of 20: " + ll.search(20)); // 0
        System.out.println("Index of 99: " + ll.search(99)); // -1

        System.out.println("Current size: " + ll.getSize()); // 1
    }
}



// package LinkList;

// public class Add {

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public static int size;

//     // Add at beginning
//     public void AddFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     // Add at end
//     public void AddLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode; // tail ka next ab new node hoga
//         tail = newNode; // tail ko update kar do
//     }

//     // Print list
//     public void print() {
//         if (head == null) {
//             System.out.println("l is empty");
//             return;
//         }
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("null");
//     }

//     // add the element in midle
//     public void AddMidle(int idx, int data) {
//         if (idx == 0) {
//             AddFirst(data);
//             return;

//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;
//         while (i < idx - 1) {
//             temp = temp.next;
//             i++;

//         }
//         // i=idx-1; temp->pre
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     // remove first node and return its data
//     public int removeFirst() {
//         if (size == 0) {
//             System.out.println("List is empty");
//             return Integer.MIN_VALUE;
//         }

//         int val = head.data;

//         if (size == 1) {
//             head = tail = null;
//         } else {
//             head = head.next;
//         }

//         size--;
//         return val;
//     }

//     // remove last element
//     public int removeLast() {
//     if (size == 0) {
//         System.out.println("List is empty");
//         return Integer.MIN_VALUE;
//     }

//     int val;

//     if (size == 1) {
//         val = head.data;
//         head = tail = null;
//         size--;
//         return val;
//     }

//     // Traverse to second last node
//     Node temp = head;
//     while (temp.next != tail) {
//         temp = temp.next;
//     }

//     val = tail.data;
//     temp.next = null;
//     tail = temp;
//     size--;

//     return val;
// }

//     public static void main(String[] args) {
//         Add ll = new Add();

//         ll.AddFirst(2);
//         ll.AddFirst(1);
//         ll.removeFirst();
//         ll.AddLast(3);
//         ll.AddLast(4);
//         ll.AddMidle(3, 18);
//         ll.removeLast();
//         ll.print(); // Output: 1 -> 2 -> 3 -> 4 -> null
//         System.out.println(ll.size);
//     }
// }
