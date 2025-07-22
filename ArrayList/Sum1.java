import java.util.ArrayList;

public class Sum1 {
    public static boolean pairSum( ArrayList<Integer> List1 , int target){
        for (int i = 0; i < List1.size(); i++) {
            for (int j = i+1; j < List1.size() ; j++) {
              if (List1.get(i)+List1.get(j)==target) {
                
                return true;
              }  
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(1);
        List1.add(3);
        List1.add(4);
        List1.add(6);
        List1.add(7);
        List1.add(8);

        int target=3;
        System.out.println(pairSum(List1, target));
    }
}
