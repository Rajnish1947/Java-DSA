public class SubsetOfString {
    
    public static void Subset(String str,String ans,int i){

        // base case
        if (i==str.length()) {
            if (ans.length()==0) {
    System.out.println("null ");
            }
            System.out.println(ans);
            return;
        }

        // this is for yes
        Subset(str, ans+str.charAt(i) , i+1);
        // this is for no
         Subset(str, ans  , i+1);
    }

    public static void main(String[] args) {
        String str="abc";
        Subset(str, "", 0);

    }
}
