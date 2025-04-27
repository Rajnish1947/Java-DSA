public class PairsOfArrayvalues {
    public static void Paisresvalues(int arr[]){
for (int i = 0; i < arr.length; i++) {
    int currentnum=arr[i];
    for (int j = i+1; j < arr.length; j++) {
        System.out.print("( "+currentnum + " "+ arr[j]+")");
    }   
    System.out.println( " ");
}
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Paisresvalues(arr);
    }
}
