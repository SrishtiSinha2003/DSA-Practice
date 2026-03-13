import java.util.Arrays;

public class chocolateDistributionProblem {
    public static int distribute(int[] arr, int m) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-m; i++) {
            int diff = arr[i+m-1] - arr[i];
            if(diff < min) {
                min = diff;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.print(distribute(arr, m));
    }
}
