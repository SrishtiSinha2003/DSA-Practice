public class LinearSearch {
    public static boolean search(int arr[], int x) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == x) 
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,3,1,5};
        int x = 8;
        System.out.println(search(arr, x));
    }
}
