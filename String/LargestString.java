public class LargestString {
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana","patato"};
        String largeString=fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            
            if (largeString.compareTo(fruits[i])<0) {
                largeString=fruits[i];
                
            }
      
        }
        System.out.println(largeString); 
    }
}
