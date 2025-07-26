
import java.util.ArrayList;

public class StackByArraylist {

    static class InnerStackByArraylist {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void Push(int data) {
            list.add(data);
        }

        // pop
        public static int Pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int Peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Use static calls since methods are static
        InnerStackByArraylist.Push(1);
        InnerStackByArraylist.Push(2);
        InnerStackByArraylist.Push(3);

        while (!InnerStackByArraylist.isEmpty()) {
            System.out.println(InnerStackByArraylist.Peek());
            InnerStackByArraylist.Pop();
        }
    }
}
