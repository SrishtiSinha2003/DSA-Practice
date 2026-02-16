import java.util.*;
public class chocolate {
    public static int distribute(int[] arr, int m) {
        int n = arr.length;
        if (m == 0 || m > n) return 0;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++) {
            int diff = arr[i+m-1] - arr[i];

            if(diff < min) {
                min = diff;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,9,56,7,9,12};
        int m = 5;
        System.out.println(distribute(arr, m));
    }
}
