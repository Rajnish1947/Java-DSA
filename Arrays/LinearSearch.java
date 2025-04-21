public class LinearSearch {
    public static int LeanerSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                return i;
                
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 3, 4, 56, 6, 7, 8, 9, 90, };
        int key = 9; 
        int index=LeanerSearch(arr, key);
        if (index==-1) {
            System.out.println("Not exit key values");
            
        }else {
            System.out.println( "index key values is "+index);
        }
        
    }
}
