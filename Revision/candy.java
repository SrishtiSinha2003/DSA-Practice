import java.util.Arrays;

public class candy {
    public static int distribute(int[] arr) {
        int n = arr.length;
        int[] candy = new int[n];
        Arrays.fill(candy, 1);
        // left to right 
        for(int i=1; i<n; i++) {
            if(arr[i] > arr[i-1]) {
                candy[i] = candy[i-1]+1;
            }
        } 
        // right to left
        for(int i=n-2; i>=0; i--) {
            if(arr[i] > arr[i+1]) {
                candy[i] = Math.max(candy[i], candy[i+1]+1);
            }
        }
        int total = 0;
        for(int x : candy) {
            total += x;
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2};
        System.out.print(distribute(arr));
    }
}