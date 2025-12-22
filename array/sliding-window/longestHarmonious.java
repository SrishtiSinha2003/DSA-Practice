import java.util.Arrays;

public class longestHarmonious {
    public static int lhs(int[] arr) {
        Arrays.sort(arr);
        int j = 0;
        int maxLen = 0;

        for(int i=0; i<arr.length; i++) {
            while(arr[i] - arr[j] > 1) {
                j++;
            }
            if(arr[i] - arr[j] == 1) {
                maxLen = Math.max(maxLen, i-j+1);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,5,2,3,7};
        System.out.println(lhs(arr));
    }
}
