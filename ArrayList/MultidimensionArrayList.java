import java.util.ArrayList;

public class MultidimensionArrayList {
    public static void main(String[] args) {
        // main list
        ArrayList<ArrayList<Integer>> Mianlist = new ArrayList<>();

        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(1);
        List1.add(3);
        List1.add(4);
        List1.add(6);
        List1.add(7);
        List1.add(8);
        Mianlist.add(List1);

        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(3);
        List2.add(6);
        List2.add(9);
        List2.add(12);
        List2.add(15);
        List2.add(18);
        List2.add(21);
        Mianlist.add(List2);

        ArrayList<Integer> List3 = new ArrayList<>();
        List3.add(2);
        List3.add(4);
        List3.add(6);
        List3.add(4);
        List3.add(10);
        List3.add(12);
        List3.add(14);
        Mianlist.add(List3);

        // Directly print the 2D list
        System.out.println("Full 2D List:");
        System.out.println(Mianlist);

        // Print individual elements row-wise
        System.out.println("\nIndividual elements:");
        for (int j = 0; j < Mianlist.size(); j++) {
            ArrayList<Integer> currentList = Mianlist.get(j);
            for (int k = 0; k < currentList.size(); k++) {
                System.out.print(currentList.get(k) + " ");
            }
            System.out.println();
        }
    }
}
