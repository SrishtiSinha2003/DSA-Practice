import java.util.Arrays;
public class firstMissingPositive {
    public static int missing(int[] arr) {
        Arrays.sort(arr);
        int ans = 1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == ans) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.print(missing(arr));
    }
}
