import java.util.*;
public class minimumCandy {
    public static int minCandy(int[] arr) {
        int[] candies = new int[arr.length];
        // fill candy array with 1 cause every child will get atleast 1 candy
        Arrays.fill(candies, 1);
        // left to right pass
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                candies[i] = candies[i-1] + 1;
            }
        }
        // right pass
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i] > arr[i+1]) {
                candies[i] = Math.max(candies[i], candies[i+1]+1);
            }
        }
        int total = 0;
        for(int x : candies) {
            total += x;
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,5};
        System.out.println(minCandy(arr));
    }
}