import java.util.ArrayList;

public class cntMostWaterPointer {
    

    public static int ArreaOfcnt(ArrayList<Integer> height) {
        int left = 0;
        int right = height.size() - 1;
        int max = 0;

        while (left < right) {
            int ht = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int currentWater = ht * width;
            max = Math.max(max, currentWater);

            // Move the pointer pointing to the shorter line
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Highest stored water: " + ArreaOfcnt(height));
    }

}
