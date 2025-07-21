import java.util.ArrayList;


public class ArraylistDefined {
    // java collection frame work
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        // Optional: Add elements
        list.add(10); //time complexity o(1)
        list.add(20);

        list1.add("Rajnish");
        list1.add("rani");

        list3.add(true);


        // Print elements

        System.out.println("ArrayList: " + list);
        System.out.println("Arraylist As String "+list1);
        System.out.println("Arraylist as Boolean "+list3);
    }
}

