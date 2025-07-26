import java.util.Stack;

public class StockSpan {

    public static void calculateSpan(int stocks[], int span[]) {

        Stack<Integer> stack = new Stack<>();
        
        span[0] = 1;  // First day span is always 1
        stack.push(0);  // Push index 0

        for (int i = 1; i < stocks.length; i++) {
            int currentPrice = stocks[i];

            // Jab tak stack empty nahi hai aur current price >= top of stack wale price
            while (!stack.isEmpty() && stocks[stack.peek()] <= currentPrice) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i); // Index push karo
        }
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = new int[prices.length]; // Span array initialize karo

        calculateSpan(prices, span); // Method call

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
