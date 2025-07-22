import java.util.ArrayList;

public class cntMostWater {

    public static int ArreaOfcnt(ArrayList<Integer> Height) {
        // if line height =0 ho tab
        int max = 0;
        // compare all line
        for (int i = 0; i < Height.size(); i++) {
            for (int j = i + 1; j < Height.size(); j++) {
                int ht = Math.min(Height.get(i), Height.get(j));
                // calculate the width
                int width = j - i;
                int currentwater = ht * width;
                max = Math.max(max, currentwater);
            }

        }
        return max;

    }

    public static void main(String[] args) {
        ArrayList<Integer> Height = new ArrayList<>();
        // the hieght of container
        Height.add(1);
        Height.add(8);

        Height.add(6);

        Height.add(2);
        Height.add(5);

        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
     
        System.out.println("Highest stored water: " + ArreaOfcnt(Height));

    }

}
