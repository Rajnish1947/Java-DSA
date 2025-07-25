package Stack;

import java.util.Stack;

public class Reverseofstack {

    // Push at bottom recursively
    public static void Bottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        Bottom(s, data);
        s.push(top);
    }

    // Reverse the stack using recursion
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        Bottom(s, top);
    }

    // Print the stack (top to bottom)
    public static void printStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            int val = s.pop();
            System.out.print(val + " ");
            temp.push(val);
        }
        System.out.println();

        // Restore the original stack
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original Stack:");
        printStack(s);

        reverseStack(s); // reverse it

        System.out.println("Reversed Stack:");
        printStack(s);
    }
}
