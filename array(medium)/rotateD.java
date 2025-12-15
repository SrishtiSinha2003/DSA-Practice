public class rotateD {
    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        // Handle the case where d > size of array
        d %= n;
        reverse(arr, 0, d-1); // first d elements
        reverse(arr, d, n-1); // remaining n-d elements
        reverse(arr, 0, n-1); // whole arr
    }
    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6};
        int d = 2;
        rotate(arr, d);
        for(int x : arr){
            System.out.println(x + " ");
        }
    }
}
