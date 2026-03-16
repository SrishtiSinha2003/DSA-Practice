import java.util.Arrays;
public class minimumDifference{
    public static int diff(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++) {
            int diff = (arr[i] - arr[i-1]);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int[] arr = {4,14,7,9,17,1};
        System.out.print(diff(arr));
    }
}