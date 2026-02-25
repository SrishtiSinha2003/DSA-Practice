import java.util.HashMap;
public class longestSubarrayWithSumDivisibleByK {
    public static int subarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        for(int i=0; i<arr.length; i++) {
            sum = ((sum + arr[i]) % k + k) % k;
            if(sum == 0) {
                res++;
            }
            else if(map.containsKey(sum)) {
                res = Math.max(res, i-map.get(sum));
            } else {
                map.put(sum,i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;
        System.out.print(subarray(arr,k));
    }
}
