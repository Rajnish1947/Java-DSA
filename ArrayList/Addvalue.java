
import java.util.ArrayList;

public class Addvalue {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();

        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();

        ArrayList<Integer> List3 = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            List1.add(i * 2);
            List2.add(i * 3);
            List3.add(i * 4);
        }
        MainList.add(List1);
        MainList.add(List2);
        MainList.add(List3);
        System.out.println(MainList);

        for (int j = 0; j < MainList.size(); j++) {
            ArrayList<Integer> currentlis = MainList.get(j);
            for (int k = 0; k < currentlis.size(); k++) {
                System.out.print(currentlis.get(k) + " ");
            }
            System.out.println();

        }
    }

}
