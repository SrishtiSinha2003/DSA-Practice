public class rotateArray {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        if(n == 0 || k == 0) {
            return;
        }
        int i,j;
        for(i = n-k, j = n-1; i<j; i++, j--) { // n - k to n - 1  
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(i=0, j = n-k-1; i<j; i++, j--) {   // 0 to n - k - 1
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(i=0, j=n-1; i<j; i++, j--) {  // 0 to n - 1
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        rotate(arr, k);

        for(int x : arr) {
            System.out.println(x + " ");
        }
    }
}
