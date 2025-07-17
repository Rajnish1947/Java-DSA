public class friendsPairing {
    public static int Friendpair(int n){
        if (n==1 || n==2) {
            return n;
            
        }
        //agar frnd
        int fn1=Friendpair(n-1);
        int totalpair=(n-1)*fn1;
        return totalpair;

    }
    public static void main(String[] args) {
      System.out.println(Friendpair(3));  
    }
}
