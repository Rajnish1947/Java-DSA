import java.util.ArrayList;

public class MaxelementArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(3);

        list.add(4);

        list.add(5);
        list.add(2);
        list.add(7);

        System.out.println(list.size());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (max<list.get(i)) {
            // max=list.get(i);
            // max=Math.max(max, list.get(i));
            // }

            // direct by in built method

            max = Math.max(max, list.get(i));

        }
        System.out.println("Max element = " + max);

    }
}
