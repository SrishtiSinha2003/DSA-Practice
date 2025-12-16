import java.util.HashMap;

public class longestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: subarray from 0 to i
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: subarray from j+1 to i
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            // Store first occurrence only
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,-10};
        int k = 24;
        int maxLen = longestSubarray(arr, k);
        System.out.println(maxLen);
    }
}
