public class ArrayAsArrguments {
    public static void Update(int Arr[]){
        for (int i = 0; i < Arr.length; i++) {
            Arr[i]+=1;
        }
    }
    public static void main(String[] args) {
        int Arr[]={78,89,45 };
        Update(Arr);
        for (int i = 0; i < Arr.length; i++) {
           
            System.out.print(Arr[i]+" ");
        }
        System.out.println( " ");
    }
}
