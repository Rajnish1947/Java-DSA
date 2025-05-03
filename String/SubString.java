public class SubString {

    public static void SubStrings (String name, int Starting, int ending){
        String subStr="";
        for (int i = Starting; i < ending; i++) {
           subStr+=name.charAt(i);

            
        }
        System.out.println(subStr);

    }
    public static void main(String[] args) {
        String name="HELLOW RAJNISH";
        // SubStrings(name,0,5);
        // you can use prebuilt function 
      
      System.out.println(name.substring(2,8)); 

    }
}
