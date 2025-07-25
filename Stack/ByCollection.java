package Stack;

import java.util.*;

public class ByCollection {

    static Stack<Integer> s = new Stack<>(); // static now

    public static void main(String[] args) {
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element is: " + s.peek()); // 30
        System.out.println("Popped: " + s.pop()); // 30
        System.out.println("Popped: " + s.pop()); // 20
        System.out.println("Popped: " + s.pop()); // 10

        if (s.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped: " + s.pop());
        }
    }
}
